package com.kimikevin.streams;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {
    public static void main(String[] args) throws IOException {
        CharArrayWriter contactWriter = new CharArrayWriter();
        FileWriter bc1 = new FileWriter("/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/business_card_1.txt", true);
        FileWriter bc2 = new FileWriter("/Users/kimi-kevin/Desktop/github/oracle-java-foundations/demo/app/src/main/resources/business_card_2.txt", true);

        contactWriter.write("Phone: 111-222-333; Address: Java Avenue, 7");
        contactWriter.writeTo(bc1);
        contactWriter.writeTo(bc2);

        char[] array = contactWriter.toCharArray();

        bc1.close();
        bc2.close();
        contactWriter.close();
    }
}
