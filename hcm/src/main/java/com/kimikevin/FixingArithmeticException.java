package com.kimikevin;

import java.util.Scanner;

public class FixingArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

//        try {
//            if(d == 0 && (b + c) == 0) {
//                System.out.println("Division by zero!");
//            } else {
//                int result = a / (b + c) / d;
//                System.out.println(result);
//            }
//        }  catch (ArithmeticException e) {
//            System.out.println("Division by zero!");
//        }

        if((b + c) / d == 0) {
            System.out.println("Division by zero!");
        } else {
            int result = a / (b + c) / d;
            System.out.println(result);
        }

        calculator(a, b, c, d);

    }

    public static void calculator(int a, int b, int c, int d) {
        if((b + c) / d == 0) {
            System.out.println("Division by zero!");
        } else {
            int result = a / (b + c) / d;
            System.out.println(result);
        }
    }

}
