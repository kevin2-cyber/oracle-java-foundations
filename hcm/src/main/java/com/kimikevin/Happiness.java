package com.kimikevin;

import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        double life = 8.6;
        double laughter = 9.0;
        double love = 7.3;
        double hate = 2.3;
        System.out.println("Happiness = " + ((life + laughter) * love - hate / 2.0));

        final Scanner scanner = new Scanner(System.in); // 1
        final int a;                                    // 2
        final int b = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
        c = b;                                          // 5
        System.out.println(c + 1);                      // 6
    }
}
