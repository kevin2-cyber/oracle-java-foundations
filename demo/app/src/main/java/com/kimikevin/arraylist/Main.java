package com.kimikevin.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Justin");
        names.add("Helen");
        names.add(1, "Joshua");
        names.add(0, "Laura");

        for (String name : names) {
            System.out.println(name);
        }

        names.set(3, "Marie");

        System.out.println(names);        // [Laura, Justin, Joshua, Marie]
        System.out.println(names.size()); // 4
        System.out.println(names.get(0)); // the first element is "Laura"
        System.out.println(names.get(3)); // the last element is "Marie"

        names.remove("Justin"); // [Laura, Joshua, Marie]
        names.remove(1);        // [Laura, Marie]
        names.clear();          // []

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(100);
        numbers2.addAll(numbers);

        System.out.println(numbers2.contains(2));    // true
        System.out.println(numbers2.contains(4));    // false
        System.out.println(numbers2.indexOf(1));     // 1
        System.out.println(numbers2.lastIndexOf(1)); // 4
        System.out.println(numbers2.lastIndexOf(4)); // -1

        ArrayList<Long> powersOfTen = new ArrayList<>();

        int count = 5;

        for (int i = 0; i < count; i++) {
            long power = (long) Math.pow(10, i);
            powersOfTen.add(power);
        }

        for (long value : powersOfTen) {
            System.out.print(value + " ");
        }
    }
}
