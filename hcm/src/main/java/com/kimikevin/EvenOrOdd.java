package com.kimikevin;

public class EvenOrOdd {
    public static void main(String[] args) {
        String result = findEvenOrOdd(5);
        String result2 = findEvenOrOdd(6);
        System.out.println(result + " and " + result2);

        int[] numbers = {5, 10, 15, 20, 25};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("The number " + numbers[i] + " is even.");
            } else {
                System.out.println("The number " + numbers[i] + " is odd.");
            }
        }
    }

    static String findEvenOrOdd(int num) {
        if (num % 2 == 0) {
           return  "Even";
        } else {
            return "Odd";
        }
    }
}
