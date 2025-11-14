package com.kimikevin.career;

public abstract class Career {

    public void execute(){
        dream();
        plan();
        study();
        work();
    }

    public abstract void work();

    public void dream() {
        System.out.println("Dream big!");
    }

    public void plan() {
        System.out.println("Draw a plan!");
    }

    public void study() {
        System.out.println("Study!");
    }
}
