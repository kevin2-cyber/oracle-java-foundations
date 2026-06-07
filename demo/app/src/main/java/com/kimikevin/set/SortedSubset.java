package com.kimikevin.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSubset {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // filling sortedSet with values from 0 to 10 ...
        for (int i = 0; i <= 10; i++) {
            sortedSet.add(i);
        }

        SortedSet<Integer> subSet = sortedSet.subSet(3, 7);

        int first = sortedSet.first();

        System.out.println("First element in sortedSet: " + first);

        System.out.println(subSet);
    }
}
