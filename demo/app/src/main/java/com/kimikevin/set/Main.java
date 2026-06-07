package com.kimikevin.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> emptySet = Set.of();
        Set<String> people = Set.of("Larry", "Kenny", "Sabrina");
        Set<Integer> numbers = Set.of(100, 200, 300, 400);

        System.out.println(emptySet); // []
        System.out.println(people);  // [Kenny, Larry, Sabrina] or another order
        System.out.println(numbers);  // [400, 200, 300, 100] or another order

        System.out.println(emptySet.contains("hello")); // false
        System.out.println(people.contains("Sabrina")); // true
        System.out.println(people.contains("John")); // false
        System.out.println(numbers.contains(300)); // true

        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("Switzerland");
        countries.add("Japan");
        countries.add("Brazil");

        System.out.println(countries);
        System.out.println(countries.contains("Switzerland"));
    }
}
