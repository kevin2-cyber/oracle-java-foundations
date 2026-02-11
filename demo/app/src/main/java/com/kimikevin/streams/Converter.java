package com.kimikevin.streams;

import java.io.IOException;

public class Converter {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Then"};
        try {
            writeWords(words);
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }
    }

    public static void writeWords(String[] words) throws IOException {
        LetterPrinter printer = new LetterPrinter();

        char[] letters = convert(words); // converting method
        for (char letter : letters) {
            printer.write(letter);
        }
    }

    public static char[] convert(String[] words) {
        // implementation of the converting method

        return String.join("", words).toCharArray();
    }
}

class LetterPrinter {
    public void write(char letter) throws IOException {
        System.out.println(letter);
    }
}
