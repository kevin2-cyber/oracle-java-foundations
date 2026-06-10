package com.kimikevin.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();

        messages.add(new Message("Alien", "Hello humans!",
                32, "2034-03-25"));
        messages.add(new Message("Pirate", "All hands on deck!",
                -2, "2034-01-05"));
        messages.add(new Message("User765214", "Bump!",
                1, "2033-02-17"));
        messages.add(new Message("Unregistered", "This message was marked as spam",
                -18, "2033-01-14"));

        System.out.println(messages);

        System.out.println("Sorting by content:");
        messages.sort(new MessageContentComparator());
        messages.forEach(System.out::println);

        System.out.println("Sorting by date:");
        messages.sort(new MessageDateComparator());
        messages.forEach(System.out::println);

        System.out.println("Sorting by author:");
        messages.sort(new MessageAuthorComparator());
        messages.forEach(System.out::println);

        System.out.println("Sorting using Java 8 features: lambda with variable");
        Comparator<Message> dateComparator = (m1, m2) ->
                m1.getCreated().compareTo(m2.getCreated());
        messages.sort(dateComparator);
        messages.forEach(System.out::println);
    }
}
