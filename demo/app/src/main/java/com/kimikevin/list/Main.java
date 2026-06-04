package com.kimikevin.list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // immutable list
        List<String> emptyList = List.of();
        List<String> names = List.of("Larry", "Kenny", "Sabrina");
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);
    }
}
