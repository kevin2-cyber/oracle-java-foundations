package com.kimikevin;


import com.kimikevin.meal.Meal;
import com.kimikevin.meal.Steak;
import com.kimikevin.templatemethod.Actor;
import com.kimikevin.templatemethod.Programmer;
import com.kimikevin.templatemethod.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // demo of template method
//        Worker programmer = new Programmer();
//        Worker actor = new Actor();
//        programmer.work();
//        System.out.println("------------------------------------------");
//        actor.work();

        // practical of template method
        final Scanner scanner = new Scanner(System.in);
        final String author = scanner.nextLine();

        scanner.close();

        Meal meal = new Steak();
        System.out.println(author + " wants to eat");
        System.out.println(author + " decides to cook meal");
        meal.doMeal();
    }
}