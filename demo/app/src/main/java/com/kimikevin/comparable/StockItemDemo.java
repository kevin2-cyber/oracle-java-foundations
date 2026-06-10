package com.kimikevin.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StockItemDemo {
    public static void main(String[] args) {
        // nails: 0.01, 512; hammers: 7.5, 24; screws: 0.02, 318
        List<StockItem> stockItems1 = List.of(
                new StockItem("nails", 0.01, 512),
                new StockItem("hammers", 7.5, 24),
                new StockItem("screws", 0.02, 318)
        );
        System.out.println("Stock items 1");
        System.out.println(StockItemUtil.sort(new ArrayList<>(stockItems1)));
        System.out.println("Stock items 2");
        // pens: 3.72, 40; pencils: 1.45, 75; notebooks: 0.84, 130
        List<StockItem> stockItems2 = List.of(
                new StockItem("pens", 3.72, 40),
                new StockItem("pencils", 1.45, 75),
                new StockItem("notebooks", 0.84, 130)
        );
        System.out.println(StockItemUtil.sort(new ArrayList<>(stockItems2)));
    }
}

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Write a method that accepts a list of StockItem objects, sorts them by their total value in descending order, and returns the sorted list. You don't need to read or write anything from or to the console, just implement the method.
class StockItemUtil {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        return stockItems.stream()
                .sorted(Comparator.comparingDouble(StockItemUtil::getTotalValue).thenComparing(StockItem::getName).reversed())
                .toList();
    }

    private static double getTotalValue(StockItem stockItem) {
        return stockItem.getPricePerUnit() * stockItem.getQuantity();
    }
}
