package com.kimikevin.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LongestString {
    static void changeList(List<String> list) {
        String longest = "";
        for (String s : list) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        String finalLongest = longest;
        Collections.fill(list, finalLongest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
