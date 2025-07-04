package com.kimikevin;

public class Parrot {
    public static void main(String[] args) {
        int myParrotWeight = 100;
        int myParrotAge = 3;

        /*
         * Now myParrotPortion equals 23
         * because our method countSeeds, as described above,
         * calculates parrotWeight / 5 + parrotAge
         */
        int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
        addSeeds(myParrotPortion);
        printSeedsCount(myParrotPortion);
    }

    public static void printSeedsCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge; // it returns an int
    }

    /**
     * The method increases the portion of seeds by 50
     * and prints the resulting value
     */
    public static void addSeeds(int portion) {
        portion += 50;
        System.out.println("The increased portion is " + portion);
    }
}
