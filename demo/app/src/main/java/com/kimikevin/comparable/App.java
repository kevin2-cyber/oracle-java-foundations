package com.kimikevin.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Score> scores = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            Score score = new Score(input[0], Integer.parseInt(input[1]));
            scores.add(score);
        }

        Collections.sort(scores);
        System.out.println(scores);
    }
}
