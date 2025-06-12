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

        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        for(int num = nums.length - 1; num >= 0; num--){
            System.out.print(num + " ");
        }
    }
}