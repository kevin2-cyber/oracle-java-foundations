package com.kimikevin;

import java.io.IOException;
import java.time.LocalDate;

public class UtilityFx {
    private static LocalDate getLocalDate() {
        LocalDate date = LocalDate.of(2017, 11, 25); // 2017-11-25 (25 November 2017)

        int year = date.getYear(); // 2017
        int month = date.getMonthValue(); // 11
        int dayOfMonth = date.getDayOfMonth(); // 25
        int dayOfYear = date.getDayOfYear();  // 329

        int lenOfYear = date.lengthOfYear(); // 365
        int lenOfMonth = date.lengthOfMonth(); // 30

        LocalDate tomorrow = date.plusDays(1);    // 2017-01-02 (2 January 2017)
        LocalDate yesterday = date.minusDays(1);  // 2016-12-31 (31 December 2016)
        LocalDate inTwoYears = date.plusYears(2); // 2019-01-01 (1 January 2019)
        return date;
    }

    public static String readTextFromFile(String path) throws IOException {
        boolean found = false; // assuming some file finding logic here
        // find a file by the specified path
        found = true; // for demonstration

        if (!found) {
            throw new IOException("The file " + path + " does not exist");
        }

        // read and return text from the file
        // for demonstration, assuming file reading logic here
        return "text from file";
    }
}
