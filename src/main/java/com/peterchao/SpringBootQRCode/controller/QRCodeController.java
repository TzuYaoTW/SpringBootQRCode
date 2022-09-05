package com.peterchao.SpringBootQRCode.controller;

import com.google.zxing.WriterException;
import com.peterchao.SpringBootQRCode.QRCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class QRCodeController {


    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @Autowired
    private QRCodeGenerator qrCodeGenerator;
    /**
     *
     * @param codeText 字串
     * @param width QRCode寬度
     * @param height QRCode高度
     * @throws IOException
     * @throws WriterException
     */
    @GetMapping(value = "/genrateAndDownloadQRCode/{codeText}/{width}/{height}")
    public void download(@PathVariable("codeText") String codeText,
                         @PathVariable("width") Integer width,
                         @PathVariable("height") Integer height) throws IOException, WriterException {
        qrCodeGenerator.generateQRCodeImage(codeText, width, height, QR_CODE_IMAGE_PATH);
    }


    @GetMapping(value = "/genrateQRCode/{codeText}/{width}/{height}")
    public ResponseEntity<byte[]> generateQRCode(@PathVariable("codeText") String codeText,
                                                 @PathVariable("width") Integer width,
                                                 @PathVariable("height") Integer height) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(qrCodeGenerator.getQRCodeImage(codeText, width, height));
    }
}