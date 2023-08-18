package com.example.pocthymeleafgeneration;

import com.example.pocthymeleafgeneration.templateloader.AzureBlobStorageTemplateLoader;
import com.example.pocthymeleafgeneration.templateloader.CustomFileSystemTemplateLoader;
import freemarker.template.Configuration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class FreemarkerConfiguration {

    @Bean
    public Configuration configuration(CustomFileSystemTemplateLoader templateLoader) {
        Configuration c = new Configuration(Configuration.VERSION_2_3_32);
        c.setTemplateLoader(templateLoader);
        return c;
    }
}
