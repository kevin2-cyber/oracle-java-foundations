package com.kimikevin.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseSortingUtils {
    public static void sortStrings(List<String> strings) {
        strings.sort(Comparator.comparing(String::toString).reversed());
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Cap", "cape", "cup", "cake", "Cook"));
        sortStrings(strings);
        strings.forEach(System.out::println);

        System.out.println("Some array list");
        List<String> list = new ArrayList<>();
        list.add("ArrayList");
        list.add("is");
        list.add("a");
        list.add("resized");
        list.add("array");

        list.forEach(System.out::println);

        System.out.println("Removing elements");
        list.remove(1);
        list.remove("a");
        list.remove(2);
        System.out.println("After removing elements");
        list.forEach(System.out::println);

    }
}
