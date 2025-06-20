package com.kimikevin;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = scanner.nextInt();

        if (num % 3 == 0) {
            isDivByThree(num);
        }  else if (num % 5 == 0) {
            isDivByFive(num);
        }  else {
            isDivByThreeAndFive(num);
        }
    }

    // function isDivByThree will be here
    public static void isDivByThree(int num) {
        if(num % 3 == 0) {
            System.out.println("Fizz");
        }
    }

    // function isDivByFive will be here
    public static void isDivByFive(int num) {
        if(num % 5 == 0) {
            System.out.println("Buzz");
        }
    }

    // function isDivByThreeAndFive will be here
    public static void isDivByThreeAndFive(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
    }
}
