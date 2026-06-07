package com.kimikevin.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // immutable sets
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

        // mutable sets: HashSet
        Set<String> countriesHash = new HashSet<>();

        countriesHash.add("India");
        countriesHash.add("Japan");
        countriesHash.add("Switzerland");
        countriesHash.add("Japan");
        countriesHash.add("Brazil");

        System.out.println(countriesHash);
        System.out.println(countriesHash.contains("Switzerland"));

        // TreeSet
        SortedSet<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);

        System.out.println(sortedSet); // [10, 13, 15, 17, 21]

        System.out.println(sortedSet.headSet(15)); // [10, 13]
        System.out.println(sortedSet.tailSet(15)); // [15, 17, 21]

        System.out.println(sortedSet.subSet(13,17)); // [13, 15]

        System.out.println(sortedSet.first()); // minimum is 10
        System.out.println(sortedSet.last());  // maximum is 21

        // LinkedHashSet
        Set<Character> characters = new LinkedHashSet<>();

        for (char c = 'a'; c <= 'k'; c++) {
            characters.add(c);
        }

        System.out.println(characters);

        Set<String> countriesSetOp = new HashSet<>(List.of("India", "Japan", "Switzerland"));

        countriesSetOp.addAll(List.of("India", "Germany", "Algeria"));
        System.out.println(countriesSetOp);

        countriesSetOp.retainAll(List.of("Italy", "Japan", "India", "Germany"));
        System.out.println(countriesSetOp);

        countriesSetOp.removeAll(List.of("Japan", "Germany", "USA"));
        System.out.println(countriesSetOp);
    }
}
