package com.kimikevin;


import com.kimikevin.templatemethod.Actor;
import com.kimikevin.templatemethod.Programmer;
import com.kimikevin.templatemethod.Worker;

public class Main {
    public static void main(String[] args) {
        // demo of template method
        Worker programmer = new Programmer();
        Worker actor = new Actor();
        programmer.work();
        System.out.println("------------------------------------------");
        actor.work();
    }
}