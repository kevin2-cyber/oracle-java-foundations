package com.kimikevin;

import java.util.Scanner;

////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
//        int departNumber = 1;
//        Employee newEmp = new Employee();
//        Department aDept = DepartmentFinder.find(departNumber);
//        aDept.assignEmployee(newEmp);
//        System.out.println(aDept.getEmployees());
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the integer
        int age = sc.nextInt();

        // Write your code here to determine the life stage based on the input age
        // You should use if...else if...else statement
        if(age <= 12) {
            System.out.println("Child");
        } else if(age >= 13 && age <= 17) {
            System.out.println("Teenager");
        }  else if(age >= 18 && age <= 56) {
            System.out.println("Adult");
        } else if(age >= 60){
            System.out.println("Senior Citizen");
        }
        // Then, print out the appropriate message

        sc.close();
    }
}