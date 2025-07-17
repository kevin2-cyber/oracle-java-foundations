package com.kimikevin;

import java.util.Scanner;

public class FixingArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        if (d == 0 || b + c == 0) {
            System.out.println("Division by zero!");
        } else {
            int denominator = (b + c) / d;
            if (denominator == 0) {
                System.out.println("Division by zero!");
            } else {
                int result = a / denominator;
                System.out.println(result);
            }
        }

    }

}
