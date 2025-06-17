package com.kimikevin;

public class EvenOrOdd {
    public static void main(String[] args) {
        String result = findEvenOrOdd(5);
        String result2 = findEvenOrOdd(6);
        System.out.println(result + " and " + result2);
    }

    static String findEvenOrOdd(int num) {
        if (num % 2 == 0) {
           return  "Even";
        } else {
            return "Odd";
        }
    }
}
