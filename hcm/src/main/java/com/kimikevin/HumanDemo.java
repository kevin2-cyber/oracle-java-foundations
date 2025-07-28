package com.kimikevin;

public class HumanDemo {
    public static void main(String[] args) {
        Human.averageWorking(); // "An average human works 40 hours per week."

        Human peter =  new Human();
        peter.name = "Peter";
        peter.work(); // "Peter loves working!"


        Human alice =  new Human();
        alice.name = "Alice";
        alice.work(); // "Alice loves working!"

        peter.workTogetherWith(alice); // "Peter loves working with Alice!"
    }

    static class Human {
        String name;
        int age;

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
