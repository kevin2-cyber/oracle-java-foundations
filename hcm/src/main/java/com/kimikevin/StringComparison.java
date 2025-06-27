package com.kimikevin;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();

        String newStringOne = inputOne.replaceAll("\\s","");
        String newStringTwo = inputTwo.replaceAll("\\s","");

        System.out.println(newStringOne.equals(newStringTwo));
    }
}
