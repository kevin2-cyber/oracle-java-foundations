package com.kimikevin;

import java.util.Arrays;

public class ArgumentMain {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(args).indexOf("test"));
        formatArgs(args);
    }

    private static void formatArgs(String[] args) {
        for (int i = 0; i < args.length; i +=2) {
            System.out.println(args[i] + "=" + args[i + 1]);
        }
    }
}
