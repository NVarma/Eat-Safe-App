package com.eatsafe.performOCR;

import android.util.Log;

import com.aspose.ocr.ImageStream;
import com.aspose.ocr.OcrEngine;

import java.io.File;

/**
 * Created by Nikita on 4/4/2015.
 */
public class PerformOCR {

    public void performOCRonImage(String dataDir){
        //String dataDir = "src/programmersguide/workingwithocr/performocronimage/data/";

        /// Set the paths
        //String imagePath = dataDir + "Sampleocr.bmp";

        // Create an instance of OcrEngine
        OcrEngine ocr = new OcrEngine();

        Log.d("path of image file: ",dataDir);
        // Set image file
        ocr.setImage(ImageStream.fromFile(dataDir));
        //ocr.setImage(imageFile);
        // Perform OCR and get extracted text
        try {
            if (ocr.process()) {
                System.out.println("\ranswer -> " + ocr.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
