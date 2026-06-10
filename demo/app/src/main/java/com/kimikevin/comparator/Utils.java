package com.kimikevin.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utils {
    public static void sortStrings(List<String> strings) {
        strings.sort(Comparator.comparing(String::toString).reversed());
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Cap", "cape", "cup", "cake", "Cook"));
        sortStrings(strings);
        strings.forEach(System.out::println);
    }
}
