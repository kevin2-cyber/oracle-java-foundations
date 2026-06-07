package com.kimikevin.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetOrMinMain {
    private static int getOrMin(Map<String, Integer> map, String key) {
        return map.containsKey(key) ? map.get(key) : Collections.min(map.values());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; ++i) {
            String key = scanner.next();
            int value = scanner.nextInt();
            m.put(key, value);
        }
        String key = scanner.next();
        int result = getOrMin(Map.copyOf(m), key);
        System.out.println(result);
    }
}
