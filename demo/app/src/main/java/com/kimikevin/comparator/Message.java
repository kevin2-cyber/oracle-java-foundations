package com.kimikevin.comparator;

import java.time.LocalDate;

public class Message {
    private final String from;
    private final String content;
    private final LocalDate created;
    private int likes;

    public Message(String from, String content, int likes, String created) {
        this.from = from;
        this.content = content;
        this.likes = likes;
        this.created = LocalDate.parse(created);
    }

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDate getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return created.toString() + " " + from + " wrote: "
                + content + " (" + likes + " likes)";
    }
}
