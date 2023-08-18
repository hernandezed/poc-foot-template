package com.example.pocthymeleafgeneration.templateloader;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import freemarker.cache.TemplateLoader;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class AzureBlobStorageTemplateLoader implements TemplateLoader {

    public static final String PATH_SEPARATOR = "/";

    private final BlobContainerClient blobContainerClient;

    public AzureBlobStorageTemplateLoader(BlobContainerClient blobContainerClient) {
        this.blobContainerClient = blobContainerClient;
    }

    @Override
    public Object findTemplateSource(String path) throws IOException {
        String ownerEntity = path.split(PATH_SEPARATOR)[0];
        String pathToSource = path.replace(ownerEntity + PATH_SEPARATOR, "");
        return findBestBlob(pathToSource, ownerEntity);
    }

    @Override
    public long getLastModified(Object o) {
        return ((BlobClient) o).getProperties().getLastModified().toEpochSecond();
    }

    @Override
    public Reader getReader(Object templateSource, String encoding) throws IOException {
        BlobClient templateSourceBlob = (BlobClient) templateSource;
        byte[] bytes = templateSourceBlob.downloadContent().toBytes();
        InputStream is = new ByteArrayInputStream(bytes);
        return new InputStreamReader(is);
    }

    @Override
    public void closeTemplateSource(Object o) throws IOException {

    }

    private BlobClient findBestBlob(String path, String ownerEntity) {
        BlobClient blobClient = blobContainerClient.getBlobClient(ownerEntity + PATH_SEPARATOR + path);

        if (Boolean.TRUE == blobClient.exists()) {
            return blobClient;
        } else {
            if (path.split(PATH_SEPARATOR).length == 2) {
                return null;
            }
            String[] pathParts = path.split("/");
            String[] newPathParts = new String[pathParts.length - 1];

            for (int i = 0; i < pathParts.length - 2; i++) {
                newPathParts[i] = pathParts[i];
            }
            newPathParts[newPathParts.length - 1] = pathParts[pathParts.length - 1];
            String newPath = Arrays.stream(newPathParts).collect(Collectors.joining("/"));
            return findBestBlob(newPath, ownerEntity);
        }
    }
}
