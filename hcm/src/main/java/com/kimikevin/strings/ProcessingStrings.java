package com.kimikevin.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessingStrings {
    public static void main(String[] args) {
//        // strings and arrays
//        char[] chars = {'A', 'B', 'C', 'D', 'E','F'};
//        String stringFromChars = String.valueOf(chars);
//
//        char[] charsFromString = stringFromChars.toCharArray();
//
//        String theSameString = new String(charsFromString);
//
//        System.out.println(Arrays.toString(chars));
//        System.out.println(stringFromChars);
//        System.out.println(Arrays.toString(charsFromString));
//        System.out.println(theSameString);
//
//        String text = "Hello";
//        String[] parts = text.split(""); // {"H", "e", "l", "l", "o"}
//        System.out.println(Arrays.toString(parts));
//
//        // splitting the string
//        String sentence = "a long text";
//        String[] words = sentence.split(" "); // {"a", "long", "text"}
//        System.out.println(Arrays.toString(words));
//
//        String number = "+1-213-345-6789";
//        String[] nParts = number.split("-"); // {"+1", "213", "345", "6789"}
//        System.out.println(Arrays.toString(nParts));
//
//        String text2 = "That's one small step for a man, one giant leap for mankind.";
//        String[] parts2 = text2.split(",");
//        System.out.println(Arrays.toString(parts2));
//        // {"That's one small step for a man", " one giant leap for mankind."}
//
//        String text3 = "I'm gonna be a programmer";
//        String[] parts3 = text3.split(" gonna be "); // {"I'm", "a programmer"}
//        System.out.println(Arrays.toString(parts3));
//
//        // iterating over a string
//        String scientistName = "Isaac Newton";
//        for (int i = 0; i < scientistName.length(); i++) {
//            System.out.println(scientistName.charAt(i) + " ");
//        }

        // "This is a sentence with multiple words."
//        // finding the longest word in a sentence
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        String longestWord = "";
//        String[] words = sentence.split(" ");
//        int longestWordLength = 0;
//        for (String word : words) {
//            if (word.length() > longestWordLength) {
//                longestWordLength = word.length();
//                longestWord = word;
//            }
//        }
//        System.out.println(longestWord);

        // to reverse a string
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }
        System.out.println(reversed);
    }
}
