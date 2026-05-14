package com.kimikevin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionUtilsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.
                filterPhones(new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "))
        );
    }
}

class CollectionUtils {
    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blackList){
        return phones.stream()
                .filter(phone -> !blackList.contains(phone))
                .collect(Collectors.toList());
    }
}