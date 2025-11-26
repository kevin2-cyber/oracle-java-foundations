package com.kimikevin.debugging;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            LOGGER.severe("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}
