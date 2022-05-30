package com.softuni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream("src/resources/image.jpg");
             FileOutputStream fos = new FileOutputStream("src/resources/copyImage.jpg")) {
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
