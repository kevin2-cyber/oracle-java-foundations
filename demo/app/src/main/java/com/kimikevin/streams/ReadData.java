package com.kimikevin.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

public class ReadData {
    /**
     * Reads file into byte array then prints it
     */
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        try(InputStream input = Files.newInputStream(Paths.get(".env"))) {
            properties.load(input);
        } catch (Exception e) {
            System.err.println("Error loading .env file: " + e.getMessage());
        }

        String filePath = properties.getProperty("READ_FILE_PATH");

    File file = new File(filePath);
        byte[] byteArray = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(byteArray);
        System.out.println(Arrays.toString(byteArray));
        fis.close();
    }
}
