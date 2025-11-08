package com.kimikevin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

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

    public static String getDayOfWeekName(int number) {
        return switch (number) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> throw new IllegalArgumentException("Invalid day");
        };
    }

    public static List<LocalDate> getMondays(int year, int month) {
        List<LocalDate> mondays = new ArrayList<>();
        YearMonth yearMonth = YearMonth.of(year, month);
        // start from the first day of the month
        LocalDate date = yearMonth.atDay(1);

        //  iterate through the month
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                mondays.add(date);
            }

            date = date.plusDays(1);
        }
        return  mondays;
    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static int findFirstIndexOfMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle empty or null array case
        }

        int maxIndex = 0; // Initialize with the index of the first element
        int maxValue = arr[0]; // Initialize with the value of the first element

        // Iterate from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i]; // Update the maximum value
                maxIndex = i; // Update the index of the first occurrence of the new maximum
            }
        }
        return maxIndex;
    }

    public static int findMaxOfAnArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        assert children != null;
        for (File child : children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                child.delete();
            }
        }
        dir.delete();
    }

    public static LocalDateTime merge(LocalDateTime firstDateTime, LocalDateTime secondDateTime) {
        int year   = Math.max(firstDateTime.getYear(),   secondDateTime.getYear());
        int month  = Math.max(firstDateTime.getMonthValue(), secondDateTime.getMonthValue());
        int day    = Math.max(firstDateTime.getDayOfMonth(), secondDateTime.getDayOfMonth());
        int hour   = Math.max(firstDateTime.getHour(),   secondDateTime.getHour());
        int minute = Math.max(firstDateTime.getMinute(), secondDateTime.getMinute());
        int second = Math.max(firstDateTime.getSecond(), secondDateTime.getSecond());
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

        private enum ThingsToTaste {
        PIZZA, BROCCOLI,
        STEAK, SUGAR,
        DIRT, MEATBALLS,
        CHOCOLATE,
    }

    private enum UserStatus {
        PENDING, ACTIVE, BLOCKED
    }

    private enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }
}
