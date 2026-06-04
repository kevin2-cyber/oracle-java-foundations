package com.kimikevin.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    }
}
