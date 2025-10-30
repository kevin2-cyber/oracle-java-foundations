package com.kimikevin.balance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        return switch (operation) {
            case DEPOSIT -> deposit(account, sum);
            case WITHDRAW -> withdraw(account, sum);
            default -> {
                System.out.println("Invalid operation.");
                yield false;
            }
        };
    }


    private static boolean deposit(Account account, Long sum) {
        if (sum <= 0) {
            return false;
        }
        Long balance = account.getBalance();
        account.setBalance(balance + sum);
        return true;
    }

    private static boolean withdraw(Account account, Long sum) {
        Long balance = account.getBalance();
        if (balance < sum) {
            System.out.println("Not enough money to withdraw.");
            return false;
        }
        account.setBalance(balance - sum);
        return true;
    }
//        return switch (operation) {
//            case DEPOSIT -> {
//                if (account.getBalance() < sum) {
//                    account.setBalance(account.getBalance() + sum);
//                }
//            }
//            case WITHDRAW -> {
//                if (account.getBalance() > sum) {
//                    account.setBalance(account.getBalance() - sum);
//                } else {
//                    System.out.println("Not enough money to withdraw");
//                }
//
//            }
//        };

}
