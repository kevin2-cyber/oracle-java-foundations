package com.kimikevin.list;

import java.util.Collections;
import java.util.List;

public class Counter {
    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return Collections.frequency(list1, elem) == Collections.frequency(list2, elem);
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(8,8,3,3,2);
        List<Integer> list2 = List.of(1,3,4,2);
        System.out.println(checkTheSameNumberOfTimes(3, list1, list2));
    }
}
