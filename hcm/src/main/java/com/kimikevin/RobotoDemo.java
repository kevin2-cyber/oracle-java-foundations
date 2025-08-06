package com.kimikevin;

public class RobotoDemo {
    public static void main(String[] args) {
        Roboto anon = new Roboto();
        System.out.println(anon);
    }
}

class Roboto{
    String name;
    String model;
    int lifetime;

    public Roboto() {
        this.name = "Anonymous";
        this.model = "Unknown";
    }

    public Roboto(String name, String model) {
        this(name, model, 20);
    }

    public Roboto(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "name=" + name + ", model=" + model + ", lifetime=" + lifetime;
    }
}
