package com.kimikevin;

import java.util.List;

public class Main {
    static class Employee {
        private String name;
        private Department departmentAssignedTo;

        public String getName() {
            return name;
        }

        public Department getDepartment() {
            return departmentAssignedTo;
        }
    }

    static class DepartmentFinder {
        private int number;

        public static Department find(int number) {
            Department department = new Department();
            department.getEmployees();
            return department;
        }
    }

    static class Department {
        private String name;
        private List<com.kimikevin.Employee> employees;

        public void assignEmployee(com.kimikevin.Main.Employee employee) {
            // do something
            System.out.println("Assigned " + employee.getName() + " to " + name);
        }

        public List<com.kimikevin.Employee> getEmployees() {
            return employees;
        }
    }
    public static void main(String[] args) {
        int departNumber = 1;
        com.kimikevin.Main.Employee newEmp = new com.kimikevin.Main.Employee();
        Department aDept = DepartmentFinder.find(departNumber);
        aDept.assignEmployee(newEmp);
        System.out.println(aDept.getEmployees());

        int[] nums = {0,1,2,3,4,5,6,7,8,9};

        for(int num = nums.length - 1; num >= 0; num--){
            System.out.print(num + " ");
        }

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