package com.kimikevin.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(13);
        list.add(47);

        Collections.sort(list);
        System.out.println(list);
    }
}
