package com.kimikevin;

import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        double life = 8.6;
        double laughter = 9.0;
        double love = 7.3;
        double hate = 2.3;
        System.out.println("Happiness = " + ((life + laughter) * love - hate / 2.0));

        System.out.println(Math.PI * Math.pow(100,2));

//        Scanner scanner = new Scanner(System.in);
//        int minutes = scanner.nextInt();
//        int hours = minutes / 60;
//        minutes %= 60;
//        if (hours > 0) {
//            hours++;
//        }
//        System.out.println(minutes + " minutes " + hours + " hours");

        Scanner scanner = new Scanner(System.in);
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();

        // Calculate and print decision
        System.out.println(isSunny && !(isRainy || isCold));

        scanner.close();
    }
}
