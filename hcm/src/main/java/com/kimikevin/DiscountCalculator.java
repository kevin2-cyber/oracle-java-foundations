package com.kimikevin;

public class DiscountCalculator {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double discountPercentage = 20.0;
        double discountAmount = originalPrice * (discountPercentage / 100.0);
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Final Price: $" + finalPrice);
    }
}
