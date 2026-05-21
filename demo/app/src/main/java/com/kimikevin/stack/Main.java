package com.kimikevin.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Deque<String> dequeString = new ArrayDeque<>();

        dequeString.offerLast("first");
        dequeString.offerLast("second");
        dequeString.offerLast("third");

        System.out.println(dequeString); // [first, second, third]

        System.out.println(dequeString.pollLast()); // third
        System.out.println(dequeString.pollLast()); // second
        System.out.println(dequeString.pollLast()); // first

        System.out.println(dequeString.pollLast()); // null

        Deque<Integer> dequeInteger = new ArrayDeque<>();
        dequeInteger.add(1);
        dequeInteger.add(2);
        dequeInteger.add(3);
        dequeInteger.add(4);
        System.out.println(dequeInteger);
        dequeInteger.push(5);
        System.out.println(dequeInteger);

        System.out.println(dequeInteger.peek());

        System.out.println(dequeInteger.pop());
        System.out.println(dequeInteger);

        Stack<String> stackString = new Stack<>();
        stackString.push("first");
        stackString.push("second");
        stackString.push("third");

        System.out.println(stackString);

        System.out.println(stackString.pop());
        System.out.println(stackString.pop());
        System.out.println(stackString.pop());

        System.out.println(stackString.pop());
    }
}