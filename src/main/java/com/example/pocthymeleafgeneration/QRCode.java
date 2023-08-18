package com.example.pocthymeleafgeneration;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

public class QRCode {

  private final String value;

  public QRCode(String value) {
    this.value = value;
  }

  public String print() throws Exception {
    QRCodeWriter barcodeWriter = new QRCodeWriter();
    BitMatrix bitMatrix =
        barcodeWriter.encode(value, BarcodeFormat.QR_CODE, 200, 200);
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    BufferedImage buffImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
    ImageIO.write(buffImage, "jpeg", os);
    return Base64.getEncoder().encodeToString(os.toByteArray());
  }
}
