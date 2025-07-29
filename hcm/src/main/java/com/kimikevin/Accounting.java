package com.kimikevin;

public class Accounting {
    public static void main(String[] args) {
        Account account = new Account();

        account.setId(1000);
        account.setCode("62968503812");
        account.setBalance(100_000_000);
        account.setEnabled(true);

        System.out.println("ID: " + account.getId());
        System.out.println("Code: " + account.getCode());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Enabled status: " + account.isEnabled());
    }
}

class Account {
    private long id;
    private String code;
    private long balance;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
