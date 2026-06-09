package com.kimikevin.comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Hello"));
        messages.add(new Message("humans!"));
        messages.add(new Message("We"));
        messages.add(new Message("came"));
        messages.add(new Message("in"));
        messages.add(new Message("peace!"));

        System.out.println(messages);

        messages.sort(new MessageContentComparator());
        messages.forEach(System.out::println);
    }
}
