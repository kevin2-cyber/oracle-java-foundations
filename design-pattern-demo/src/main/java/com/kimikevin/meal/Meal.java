package com.kimikevin.meal;

public abstract class Meal {
    /**
     * It provides template method of meal routine.
     */
    public void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();
    public abstract void cook();

    public void eat() {
        System.out.println("That's good");
    }

    public abstract void cleanUp();
}
