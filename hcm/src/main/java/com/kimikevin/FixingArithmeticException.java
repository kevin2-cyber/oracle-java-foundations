package com.kimikevin;

import java.util.Scanner;

public class FixingArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        try {
            if(d == 0) {
                System.out.println("Division by zero!");
            } else {
                int result = a / (b + c) / d;
                System.out.println(result);
            }
        } catch(ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }

}
