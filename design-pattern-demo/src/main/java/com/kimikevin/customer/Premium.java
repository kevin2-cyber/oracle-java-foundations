package com.kimikevin.customer;

public class Premium extends Customer{
    @Override
    public void generateCustomerID() {
        System.out.println("Your premium account identification number: PA-01");
    }

    @Override
    public void sendGift() {
        System.out.println("You received 100 Gems");
    }
}
