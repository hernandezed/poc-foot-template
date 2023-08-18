package com.example.pocthymeleafgeneration;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Map;

@Component
public class TemplateEngine {

    private final Configuration configuration;

    public TemplateEngine(Configuration configuration) {
        this.configuration = configuration;
    }

    public InputStream process(String path, Map<String, Object> placeholders) throws IOException, TemplateException {
        Template template = configuration.getTemplate(path);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Writer writer = new OutputStreamWriter(out);
        template.process(placeholders, writer);
        return new ByteArrayInputStream(out.toByteArray());
    }
}
