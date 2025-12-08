package com.kimikevin.debugging;

public class MoneyTransfer {
    public static void main(String[] args) {
        double balance = 1000;
        double transferAmount = 600;
        double newBalance = transferMoney(balance, transferAmount);
        System.out.println("Account balance: " + newBalance);
    }

    private static double transferMoney(double balance, double transferAmount) {
        var newBalance = balance - transferAmount;
        updateBalanceInfo(newBalance);
        return newBalance;
    }

    private static void updateBalanceInfo(double newBalance) {
        System.out.println("Balance is updated. New balance: " + newBalance);
    }
}
