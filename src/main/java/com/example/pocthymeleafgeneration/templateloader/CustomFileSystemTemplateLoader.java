package com.example.pocthymeleafgeneration.templateloader;

import freemarker.cache.TemplateLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


@Component
public class CustomFileSystemTemplateLoader implements TemplateLoader {
    @Override
    public Object findTemplateSource(String name) throws IOException {
        return getClass().getClassLoader().getResource("templates/" + name + ".ftl").openStream();
    }

    @Override
    public long getLastModified(Object templateSource) {
        return 0;
    }

    @Override
    public Reader getReader(Object templateSource, String encoding) throws IOException {
        return new InputStreamReader(((InputStream) templateSource));
    }

    @Override
    public void closeTemplateSource(Object templateSource) throws IOException {
        ((InputStream) templateSource).close();
    }
}
