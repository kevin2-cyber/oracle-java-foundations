package com.kimikevin.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Map.of();
        Map<String, String> friendPhones = Map.of(
                "Bob", "+1-202-555-0118",
                "James", "+1-202-555-0220",
                "Katy", "+1-202-555-0175"
        );

        System.out.println(emptyMap.size());     // 0
        System.out.println(friendPhones.size()); // 3

        String bobPhone = friendPhones.get("Bob"); // +1-202-555-0118
        String alicePhone = friendPhones.get("Alice"); // null
        String phone = friendPhones.getOrDefault("Alex", "Unknown phone"); // Unknown phone

        System.out.println(bobPhone);
        System.out.println(alicePhone);
        System.out.println(phone);

        System.out.println(friendPhones.keySet()); // [James, Bob, Katy]
        System.out.println(friendPhones.values()); // [+1-202-555-0220, +1-202-555-0118, +1-202-555-0175]

        Map<Integer, String> products = new HashMap<>();

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}
        System.out.println(products.get(1000)); // Notebook

        products.remove(1000);
        System.out.println(products.get(1000)); // null

        products.putIfAbsent(3000, "Mouse"); // it does not change the current element
        System.out.println(products.get(3000)); // Keyboard
    }
}
