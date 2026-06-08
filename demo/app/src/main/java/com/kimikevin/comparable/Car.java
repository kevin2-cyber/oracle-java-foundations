package com.kimikevin.comparable;

public class Car implements Comparable<Car>{
    private int number;
    private String model;
    private String color;
    private int weight;

    public Car(int number, String model, String color, int weight) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(getNumber(), other.getNumber());
    }
}
