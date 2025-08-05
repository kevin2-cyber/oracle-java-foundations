package com.kimikevin;

import java.util.Date;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        class Person{
            protected String name;
            protected int yearOfBirth;
            protected String address;

            public Person(String name, int yearOfBirth, String address) {
                this.name = name;
                this.yearOfBirth = yearOfBirth;
                this.address = address;
            }

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

        class Employee extends Person{
            protected Date startDate;
            protected Long salary;

            public Employee(String name, int yearOfBirth, String address, Date startDate, Long salary) {
                super(name, yearOfBirth, address); // invoking a constructor of the superclass

                this.startDate = startDate;
                this.salary = salary;
            }

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
}
