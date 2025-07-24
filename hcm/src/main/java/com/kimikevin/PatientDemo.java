package com.kimikevin;

public class PatientDemo {

    public static void main(String[] args) {

        Patient john = new Patient();

        john.name = "John";
        john.age = 30;
        john.height = 180;

        System.out.println(john.name + " " + john.age + " " + john.height);

        Patient alice = new Patient();

        alice.name = "Alice";
        alice.age = 22;
        alice.height = 165;

        System.out.println(alice.name + " " + alice.age + " " + alice.height);

        Human human = new Human();
        human.printInstance();
        Human.printStatic();
    }
}

class Patient {

    String name;
    int age;
    float height;
}

class Human {
    String name;
    int age;

    public static void printStatic() {
        System.out.println("It's a static method");
    }

    public void printInstance() {
        System.out.println("It's an instance method");
    }
}
