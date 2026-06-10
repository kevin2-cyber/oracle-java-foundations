package com.kimikevin.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorUserDemo {
    public static void main(String[] args) {
        // John=25, Jane=25, Jim=18, Jack=18, John=30
        System.out.println("Primary: users");
        List<ComparatorUser> primary = List.of(
                new ComparatorUser("John", 25),
                new ComparatorUser("Jane", 25),
                new ComparatorUser("Jim", 18),
                new ComparatorUser("Jack", 18),
                new ComparatorUser("John", 30)
        );
        ComparatorUserUtils.sortUsers(new ArrayList<>(primary));
        System.out.println(primary);

        //Abby=19, Alice=19, Abby=21, Alice=21, Ashley=19
        System.out.println("Secondary: users");
        List<ComparatorUser> secondary = List.of(
                new ComparatorUser("Abby", 19),
                new ComparatorUser("Alice", 19),
                new ComparatorUser("Abby", 21),
                new ComparatorUser("Alice", 21),
                new ComparatorUser("Ashley", 19)
        );
        ComparatorUserUtils.sortUsers(new ArrayList<>(secondary));
        System.out.println(secondary);

    }
}

class ComparatorUser {
    private String name;
    private int age;

    public ComparatorUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ComparatorUserUtils {
    public static void sortUsers(List<ComparatorUser> users) {
        // your code here
        // Users should be sorted by their names in lexicographic order and if two or more users have the same names,
        // they should be sorted by their age in descending order.
        users.sort(
                Comparator.comparing(ComparatorUser::getName)
                        .thenComparing(Comparator.comparingInt(ComparatorUser::getAge).reversed())
        );
    }
}
