package com.kimikevin;


import com.kimikevin.career.Career;
import com.kimikevin.career.DataScientist;
import com.kimikevin.career.Engineer;
import com.kimikevin.meal.Meal;
import com.kimikevin.meal.Sandwich;
import com.kimikevin.meal.Steak;
import com.kimikevin.social.Facebook;
import com.kimikevin.social.Instagram;
import com.kimikevin.social.SocialNetwork;
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
//
//        // practical of template method
//        final Scanner scanner = new Scanner(System.in);
//        final String author = scanner.nextLine();
//
//        scanner.close();
//
//        Meal meal = new Steak();
//        System.out.println(author + " wants to eat");
//        System.out.println(author + " decides to cook meal");
//        meal.doMeal();

//        // career template method demo
//        final Scanner scanner = new Scanner(System.in);
//        final String type = scanner.nextLine();
//        scanner.close();
//        Career plan = null;
//        if ("engineer".equalsIgnoreCase(type)) {
//            plan = new Engineer();
//        } else if ("scientist".equalsIgnoreCase(type)) {
//            plan = new DataScientist();
//        } else {
//            System.out.println("Error!");
//            System.exit(0);
//        }
//        plan.execute();

//        // meal template method demo
//        final Scanner scanner = new Scanner(System.in);
//        final String order = scanner.nextLine();
//        scanner.close();
//        Meal meal = null;
//        if ("Sandwich".equalsIgnoreCase(order)) {
//            meal = new Sandwich();
//            meal.doMeal();
//        } else if ("Steak".equalsIgnoreCase(order)) {
//            meal = new Steak();
//            meal.doMeal();
//        } else {
//            System.out.println("Error!");
//            System.exit(0);
//        }

        // social network template method demo
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();

    }
}