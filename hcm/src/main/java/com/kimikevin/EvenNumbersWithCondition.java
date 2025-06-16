package com.kimikevin;

import java.util.Scanner;

public class EvenNumbersWithCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 10) {
                i += 5;
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
