package com.kimikevin;

import java.util.Scanner;

public class TriplesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(countTriples(array));
    }

    public static int countTriples(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int a = array[i];
            int b = array[i + 1];
            int c = array[i + 2];
            if (b == a + 1 && c == b + 1) {
                count++;
            }
        }
        return count;
    }
}
