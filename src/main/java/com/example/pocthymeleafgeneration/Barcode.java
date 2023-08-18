package com.example.pocthymeleafgeneration;

import org.apache.commons.lang3.StringUtils;
import org.krysalis.barcode4j.HumanReadablePlacement;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Barcode {
    private final String ffmCenterId;
    private final String orderNumber;
    private final String currentBox;
    private final String totalBoxes;
    private final String shipmentType;
    private final String verificationCode;

    public Barcode(String ffmCenterId, String orderNumber, String currentBox, String totalBoxes, String shipmentType) {
        try {
            this.ffmCenterId = StringUtils.leftPad(ffmCenterId, 3, "0");
            this.orderNumber = StringUtils.leftPad(orderNumber, 9, "0");
            this.currentBox = StringUtils.leftPad(currentBox, 3, "0");
            final String totalBoxesNumber = "0"; // use when totalBoxes is shown "-".equals(totalBoxes) ? "0" : totalBoxes
            this.totalBoxes = StringUtils.leftPad(totalBoxesNumber, 2, "0");
            this.shipmentType = StringUtils.leftPad(shipmentType, 2, "0");
            this.verificationCode = generateVerificationCode(this.ffmCenterId, this.orderNumber, this.currentBox, this.totalBoxes, this.shipmentType);
        } catch (IllegalArgumentException ex) {
            throw new RuntimeException(ex);
        }
    }

    public Barcode(String code) {
        this(code.substring(0, 3), code.substring(3, 12), code.substring(12, 15),
                code.substring(15, 17), code.substring(17, 19));
    }

    private static String generateVerificationCode(String ffmCenterId, String orderNumber, String currentBox, String totalBoxes, String shipmentType) {
        String code = ffmCenterId + orderNumber + currentBox + totalBoxes + shipmentType;
        String[] digits = StringUtils.reverse(code).split("");
        int checkshum = 0;
        for (int i = 0; i < digits.length; i++) {
            checkshum += Integer.parseInt(digits[i]) * (3 - 2 * (i % 2));
        }
        return String.valueOf((10 - (checkshum % 10)) % 10);
    }

    @Override
    public String toString() {
        return ffmCenterId + orderNumber + currentBox + totalBoxes + shipmentType + verificationCode;
    }

    public String print() throws IOException {
        Code128Bean barcodeGenerator = new Code128Bean();
        BitmapCanvasProvider canvas =
                new BitmapCanvasProvider(240, BufferedImage.TYPE_BYTE_BINARY, false, 0);
        barcodeGenerator.setHeight(5.6);
        barcodeGenerator.setMsgPosition(HumanReadablePlacement.HRP_NONE);
        barcodeGenerator.generateBarcode(canvas, toString());
        BufferedImage bufferedImage = canvas.getBufferedImage();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
        return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    }
}
