package com.kimikevin;

import java.util.Scanner;

class SimpleCalculatorUtil {
    // Implement your methods here
    public static void subtractTwoNumbers(long num1, long num2) {
        System.out.println(num1 - num2);
    }


    public static void sumTwoNumbers(long num1, long num2) {
        System.out.println(num1 + num2);
    }


    public static void divideTwoNumbers(long num1, long num2) {
        if(num2 == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(num1 / num2);
        }
    }


    public static void multiplyTwoNumbers(long num1, long num2) {
        System.out.println(num1 * num2);
    }

    // Implemented method
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculatorUtil.power(num1, num2);
                break;
            case "+":
                SimpleCalculatorUtil.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculatorUtil.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculatorUtil.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculatorUtil.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}
