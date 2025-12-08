package com.kimikevin.debugging;

public class PurchaseOrder {
    public static void main(String[] args) {
        double totalCost = processOrder(9.99,5);
        System.out.println("Total cost: " + totalCost);
    }

    public static double processOrder(double price, int quantity) {
        double totalPriceBeforeTaxes = price * quantity;
        updateInventory(quantity);
        double totalPriceAfterTax = Math.round(totalPriceBeforeTaxes * 1.07);
        updateTaxInfo(totalPriceAfterTax);
        return totalPriceAfterTax;
    }

    private static void updateInventory(int quantity) {
        System.out.println("Inventory is updated. Sold quantity: " + quantity);
    }

    private static void updateTaxInfo(double afterPriceTax) {
        System.out.println("Tax info is updated. Price after tax: " + afterPriceTax);
    }
}
