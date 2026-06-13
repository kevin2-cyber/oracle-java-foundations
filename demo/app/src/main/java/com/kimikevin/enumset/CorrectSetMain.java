package com.kimikevin.enumset;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class CorrectSetMain {
    enum Element {
        FIRE, WIND, EARTH, SKY, WATER
    }
    public static void main(String[] args) {
        // Change this statement
        Set<Element> set = EnumSet.allOf(Element.class);

        /* instanceof operator returns true if set object has EnumSet type
         *  and false - otherwise
         */
        System.out.println(set instanceof EnumSet<Element>);
        System.out.println(set);
    }
}
