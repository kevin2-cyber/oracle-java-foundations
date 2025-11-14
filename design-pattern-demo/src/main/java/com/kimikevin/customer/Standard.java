package com.kimikevin.customer;

public class Standard extends Customer{
    @Override
    public void generateCustomerID() {
        System.out.println("Your standard account identification number: ST-01");
    }

    @Override
    public void sendGift() {
        System.out.println("You received 50 Gems");
    }
}
