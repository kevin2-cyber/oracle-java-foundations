package com.kimikevin;

public class RaceConditionDemo {
    public static int balance = 0;

    /**
     * Demonstrates race condition with concurrent deposits; reports result
     */
    public static void main(String[] args) throws InterruptedException{
        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                deposit();
            }
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                deposit();
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Expected Balance: 20000");
        System.out.println("Actual Balance: " + balance);
    }

    public static synchronized void deposit() {
        balance++;
    }
}
