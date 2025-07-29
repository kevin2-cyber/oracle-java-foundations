package com.kimikevin;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an object of the Book class
        Book book = new Book();

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int numOfPages = scanner.nextInt();

        book.setTitle(title);
        book.setAuthor(author);
        book.setNumOfPages(numOfPages);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumOfPages());
    }
}

// Creating class
class Book {
    // set up three private properties
    private String title;
    private String author;
    private int numOfPages;

    // getters and setters go here
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        if (numOfPages > 0) {
            this.numOfPages = numOfPages;
        }
    }

    // Remember:
    // 1. They must not allow empty string for 'title' and 'author'.
    // 2. They must not allow negative or zero value for 'numberOfPages'.
    // 3. If such values are attempted to be set, the property should remain unchanged.
}
