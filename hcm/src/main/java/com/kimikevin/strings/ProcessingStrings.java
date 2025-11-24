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

//        // to reverse a string
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        StringBuilder reversed = new StringBuilder();
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            reversed.append(sentence.charAt(i));
//        }
//        System.out.println(reversed);

//        // modifying a string by changing letters and digits
//        Scanner scanner = new Scanner(System.in);
//        String sentence = scanner.nextLine();
//        StringBuilder modified = new StringBuilder();
//        for (int i = 0; i < sentence.length(); i++) {
//            char c = sentence.charAt(i);
//            if (Character.isDigit(c)) {
//                if (c == '0') {
//                    modified.append('9');
//                } else {
//                    modified.append((char) (c - 1));
//                }
//            } else if (Character.isLetter(c)) {
//                if (c == 'z') {
//                    modified.append('a');
//                } else {
//                    modified.append((char) (c + 1));
//                }
//            }
//        }
//        System.out.println(modified);

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        System.out.println(isMagicalMirror(input));

        // counting occurrences of a substring
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String subString = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = string.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        System.out.println(count);
    }

    public static String isMagicalMirror(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            return input + " is a palindrome";
        } else {
            return input + " is not a palindrome";
        }
    }
}
