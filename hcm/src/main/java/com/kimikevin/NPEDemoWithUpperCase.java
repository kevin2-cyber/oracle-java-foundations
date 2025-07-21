package com.kimikevin;

import java.util.Locale;
import java.util.Scanner;

public class NPEDemoWithUpperCase {
    public static String toUpperCase(String str) {
        if(str == null) {
            return "";
        } else {
            return str.toUpperCase(Locale.ENGLISH);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
