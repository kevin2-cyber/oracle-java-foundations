package com.kimikevin.comparator;

import java.util.Comparator;

public class MessageContentComparator implements Comparator<Message> {
    @Override
    public int compare(Message messageOne, Message messageTwo) {
        int firstLength = messageOne.getContent().length();
        int secondLength = messageTwo.getContent().length();
        return Integer.compare(firstLength, secondLength);
    }
}
