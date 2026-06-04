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
    }
}
