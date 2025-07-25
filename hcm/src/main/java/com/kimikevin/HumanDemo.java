package com.kimikevin;

public class HumanDemo {
    public static void main(String[] args) {
        Human human = new Human();
        human.printInstance();
        Human.printStatic();
    }

    static class Human {
        String name;
        int age;

        public static void printStatic() {
            System.out.println("It's a static method");
        }

        public void printInstance() {
            System.out.println("It's an instance method");
        }

        public static void averageWorking() {
            System.out.println("An average human works 40 hours per week.");
        }

        public void work() {
            System.out.println(this.name + " loves working!");
        }

        public void workTogetherWith(Human other) {
            System.out.println(this.name + " loves working with " + other.name + '!');
        }
    }
}
