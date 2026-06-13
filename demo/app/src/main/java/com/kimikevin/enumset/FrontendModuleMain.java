package com.kimikevin.enumset;

import java.util.EnumSet;
import java.util.Scanner;

public class FrontendModuleMain {

    enum Fonts {
        BOLD, LARGE, MEDIUM, SMALL, ITALIC, NORMAL
    }

    EnumSet<Fonts> enumSet;
    public static void main(String[] args) {
        FrontendModuleMain object = new FrontendModuleMain();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();

        switch (string) {
            case "Main-Heading":
                object.enumSet = EnumSet.of(Fonts.BOLD, Fonts.LARGE, Fonts.NORMAL);
                break;
            case "Quote":
                object.enumSet = EnumSet.of(Fonts.SMALL, Fonts.ITALIC);
                break;
            case "Paragraph":
                object.enumSet = EnumSet.of(Fonts.SMALL, Fonts.NORMAL);
                break;
            case "Sub-Heading":
                object.enumSet = EnumSet.of(Fonts.MEDIUM, Fonts.NORMAL);
                break;
            case "Quote|BOLD":
                object.enumSet = EnumSet.of(Fonts.BOLD, Fonts.SMALL, Fonts.ITALIC);
                break;
            default : System.out.println("ERROR");
                break;
        }

        System.out.println(object.enumSet);
    }
}
