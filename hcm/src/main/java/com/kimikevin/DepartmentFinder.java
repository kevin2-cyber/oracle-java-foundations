package com.kimikevin;

public class DepartmentFinder {
    private int number;

    public static Department find(int number) {
        Department department = new Department();
        department.getEmployees().forEach(Employee::getDepartment);
        return department;
    }
}

