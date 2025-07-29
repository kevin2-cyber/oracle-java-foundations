package com.kimikevin;


public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount kofi = new BankAccount(2000);
        kofi.deposit(500);
        kofi.withdraw(200);
        System.out.println(kofi.getBalance());
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}
