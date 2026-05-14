package com.kimikevin.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove("first");

        System.out.println(list);

        System.out.println(list.size());

        list.add(0,"first");
        System.out.println(list);
        System.out.println(list.size());

        Collection<String> languages = new ArrayList<>();

        languages.add("English");
        languages.add("Deutsch");
        languages.add("Français");

        System.out.println(languages.size());

        for (String lang : languages) {
            System.out.println(lang);
        }

        languages.forEach(System.out::println);

        languages.forEach(lang -> System.out.println(lang));

        languages.remove("Deutsch");
        System.out.println(languages.size());
    }
}