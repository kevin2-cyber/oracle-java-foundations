package com.kimikevin;

public class ProductPriceCalculator {
    public static void main(String[] args) {
        double basePrice = 100.0, taxRate = 8.0, discountAmount = 10.0;

        double taxAmount = basePrice * (taxRate / 100.0);

        double finalPrice = basePrice + taxAmount - discountAmount;

        System.out.printf("Final Price: %.2f%n", finalPrice);
    }
}
