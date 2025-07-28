package com.kimikevin;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] numbers = { 10, 4, 5, 47, 5, 12 }; // an array

        sort(numbers); // instead of writing Arrays.sort(...)

        int[] copy = copyOf(numbers, numbers.length); // instead of writing Arrays.copyOf(...)
    }
}
