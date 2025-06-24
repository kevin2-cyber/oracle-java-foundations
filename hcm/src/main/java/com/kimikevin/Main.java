package com.kimikevin;

public class Main {
    public static void main(String[] args) {
//        int departNumber = 1;
//        Employee newEmp = new Employee();
//        Department aDept = DepartmentFinder.find(departNumber);
//        aDept.assignEmployee(newEmp);
//        System.out.println(aDept.getEmployees());

//        int[] nums = {0,1,2,3,4,5,6,7,8,9};
//
//        for(int num = nums.length - 1; num >= 0; num--){
//            System.out.print(num + " ");
//        }

        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

        int counter = 0;
        for (char ch : characters) {
            if (ch == 'a') {
                counter++;
            }
        }

        System.out.println(counter); // it outputs "3"

        int count = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                count++;
            }
        }

        System.out.println(count); // it outputs "3"
    }
}