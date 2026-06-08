package com.kimikevin.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(13);
        list.add(47);

        Collections.sort(list);
        System.out.println(list);

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(876, "BMW", "white", 1400);
        Car car2 = new Car(345, "Mercedes", "black", 2000);
        Car car3 = new Car(470, "Volvo", "blue", 1800);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars);
        System.out.println(cars);
    }
}
