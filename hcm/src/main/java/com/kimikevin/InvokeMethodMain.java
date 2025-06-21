package com.kimikevin;

public class InvokeMethodMain {
    public static void main(String[] args) {
        calculateVolume(3, 7, 2); // The volume of a box is equal to 42
        calculateVolume(14, 6, 8); // The volume of a box is equal to 672
        calculateVolume(2, 2, 2); // The volume of a box is equal to 8
    }

    static void calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println("The volume of a box is equal to " + volume);
    }
}
