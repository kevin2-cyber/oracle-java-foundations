package com.kimikevin;

import java.util.Date;

public class SuperClassDemo {
    public static void main(String[] args) {

        Person person = new Employee();
        person.setName("Ginger R. Lee");

        Client client = new Client();
        client.setName("Pauline E. Morgan");

        Employee employee = new Employee();
        employee.setName("Lawrence V. Jones");

        Person[] persons = {person, client, employee};

        printNames(persons);
    }

    private static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    static class Person {

        protected String name;
        protected int yearOfBirth;
        protected String address;

        // public getters and setters for all fields
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    static class Client extends Person {

        protected String contractNumber;
        protected boolean gold;

        // public getters and setters for all fields
        public String getContractNumber() {
            return contractNumber;
        }

        public void setContractNumber(String contractNumber) {
            this.contractNumber = contractNumber;
        }

        public boolean isGold() {
            return gold;
        }

        public void setGold(boolean gold) {
            this.gold = gold;
        }
    }

    static class Employee extends Person {

        protected Date startDate;
        protected Long salary;

        // public getters and setters for all fields
        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }
}
