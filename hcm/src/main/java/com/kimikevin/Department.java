package com.kimikevin;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public void assignEmployee(Employee employee) {
        // do something
        System.out.println("Assigned " + employee.getName() + " to " + name);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
