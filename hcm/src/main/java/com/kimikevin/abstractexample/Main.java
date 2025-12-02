package com.kimikevin.abstractexample;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("Kitty", 5);
        cat.say();
        Pet dog = new Dog("Buddy", 3);
        dog.say();
        System.out.println(args[0]);

    }
}
