package com.kimikevin.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // immutable list
        List<String> emptyList = List.of();
        List<String> names = List.of("Larry", "Kenny", "Sabrina");
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);

        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        List<Integer> testNumbers = Arrays.asList(1,2,3,4,5); // fixed-size list
        testNumbers = Collections.unmodifiableList(testNumbers); // unmodifiable list

        List<Integer> numberArrayList = new ArrayList<>();

        numberArrayList.add(15);
        numberArrayList.add(10);
        numberArrayList.add(20);

        System.out.println(numberArrayList); // [15, 10, 20]

        numberArrayList.set(0, 30); // no exceptions here

        System.out.println(numberArrayList); // [30, 10, 20]

        List<String> immutableList = List.of("one", "two", "three");
        List<String> mutableList = new ArrayList<>(immutableList);

        List<Integer> numberLinkedList = new LinkedList<>();

        numberLinkedList.add(10);
        numberLinkedList.add(20);
        numberLinkedList.add(30);

        System.out.println(numberLinkedList);
    }
}
