package com.kimikevin;


public class Car {
    private static int totalCars = 0;
    private String model;

    public Car() {
        this("Unknown");
    }

    public Car(String model) {
        this.model = model;
        totalCars++;
    }

    public void displayModel() {  // Instance method
        System.out.println("Model: " + this.model);
    }

    public static void displayTotalCars() {  // Static method
        System.out.println("Total cars: " + totalCars);
    }
}
