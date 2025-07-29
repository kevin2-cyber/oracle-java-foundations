package com.kimikevin;

public class PromotionalSalary {
    public static void main(String[] args) {
        Salary salary = new Salary(1000);
        Promotion promotion = new Promotion(salary);
        promotion.promote();
        System.out.println("Salary after promotion: " + salary.income);
    }
}

class Salary {
   long income;

  Salary(long income) {
       this.income = income;
   }
}

class Promotion {
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;
    }

    public void promote() {
        salary.income += 1500;
    }
}
