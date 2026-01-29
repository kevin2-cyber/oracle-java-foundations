package com.kimikevin;

public class Account {
    private long balance = 0;

    /**
     * Deposits amount; throws on invalid or excessive input
     */
    public void deposit(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Incorrect amount " + amount);
        }

        if (amount >= 100_000_000L) {
            throw new IllegalArgumentException("Too large amount");
        }

        balance += amount;
    }

    public long getBalance() {
        return balance;
    }
}
