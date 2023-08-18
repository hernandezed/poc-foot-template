package com.example.pocthymeleafgeneration;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.fop.svg.PDFTranscoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class PocThymeleafGenerationApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(PocThymeleafGenerationApplication.class, args);
        Barcode barcode = new Barcode("46448685917000100043");
        QRCode qrCode =
                new QRCode("https://www.zara.com/integration/mectitofa/web/qr?brand=ZA&locale=EN&market=IN&reference=32247595037300100032");

        Map<String, Object> context = new HashMap<>();
        context.put("countryCode", "BR");
        context.put("customerOrderCode", "52924513169");
        context.put("customerOrderCodeRight2", "69");
        context.put("sequence", "01");
        context.put("totalBoxes", "02");
        context.put("transportServiceLevelCode", "CAC");
        context.put("maxExpeditionDate", "01.02.2023");
        context.put("storeId", "1431");
        context.put("storeName", "GUN-FORUM DES ALPES");
        context.put("shipmentFullName", "Miria Rodrigues De Brito");
        context.put("transportRouteDescription", "CH_TIENDAS_GVA");
        context.put("shortCourierTag", "IND ITX");
        context.put("barcode", barcode.toString());
        context.put("barcodeImage", barcode.print());
        context.put("qrCode", qrCode.print());
        context.put("urgency", "U");
        context.put("maxExpeditionDay", "20");

        InputStream is = ctx.getBean(TemplateEngine.class).process("foot_template", context);
        // hasta aca llegaria docu segun edu
        
        // desde aca otra aplicacion
        PDFTranscoder transcoder = new PDFTranscoder();
        
        File targetFilePdf = new File("src/main/resources/targetFile.pdf");
        OutputStream os = new FileOutputStream(targetFilePdf);

        TranscoderInput transcoderInput = new TranscoderInput(is);
        TranscoderOutput transcoderOutput = new TranscoderOutput(os);
        transcoder.transcode(transcoderInput, transcoderOutput);
        
        System.out.println(new String(is.readAllBytes(), StandardCharsets.UTF_8));

    }

}
