package com.kimikevin.set;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> emptySet = Set.of();
        Set<String> people = Set.of("Larry", "Kenny", "Sabrina");
        Set<Integer> numbers = Set.of(100, 200, 300, 400);

        System.out.println(emptySet); // []
        System.out.println(people);  // [Kenny, Larry, Sabrina] or another order
        System.out.println(numbers);  // [400, 200, 300, 100] or another order
    }
}
