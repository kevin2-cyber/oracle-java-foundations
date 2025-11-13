package com.kimikevin.customer;

public abstract class Customer {

    public void creatAccount() {
        verifyIdentity();
        generateCustomerID();
        sayThankYou();
        sendGift();
    }

    public abstract void generateCustomerID();
    public abstract void sendGift();

    public void verifyIdentity() {
        System.out.println("Verify your identity");
    }

    public void sayThankYou() {
        System.out.println("Thank you for creating a new customer account!");
    }
}
