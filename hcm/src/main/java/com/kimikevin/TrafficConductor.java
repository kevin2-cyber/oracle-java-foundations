package com.kimikevin;

import java.util.Scanner;

public class TrafficConductor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);

        System.out.println(amountOfDaysInAMonth(2));
    }

    public static String getNextState(int currentState) {
        // 0 = Red, 1 = Yellow, 2 = Green
        return switch (currentState) {
            case 0 -> "1";
            case 1 -> "2";
            case 2 -> "0";
            default -> "Invalid";
        };
    }

    public static String getAction(int currentState) {
        return switch (currentState) {
            case 0 -> "Change to Yellow";
            case 1 -> "Change to Green";
            case 2 -> "Change to Red";
            default -> "Unknown action";
        };
    }

    static String amountOfDaysInAMonth(int monthNumber) {
        return switch (monthNumber) {
            case 2 -> "28 or 29 days";
            case 4, 6, 9, 11 -> "30 days";
            default -> "31 days";
        };
    }
}
