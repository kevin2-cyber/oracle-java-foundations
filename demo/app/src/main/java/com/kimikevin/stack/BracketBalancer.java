package com.kimikevin.stack;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalancer {

    public static boolean isBalanced(String s) {
        // 1. Create an instance of a stack
        Stack<Character> stack = new Stack<>();

        // 2. Traverse the input string character by character
        for (char c : s.toCharArray()) {

            // 3. If it is an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // 4. If it is a closing bracket, process it
            else if (c == ')' || c == '}' || c == ']') {

                // If the stack is empty here, we have a closing bracket with no opening pair!
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element
                char top = stack.pop();

                // Check if the popped bracket is the correct pair for the current closing bracket
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }

        // 5. If the traversal is done and the stack is empty, everything matched perfectly.
        // If it's NOT empty, we had leftover opening brackets.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test Case 1 (Should be true)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Result 1: " + isBalanced(input));

        // Test Case 2 (Should be false)
        System.out.println("Result 2: " + isBalanced("()[]}"));
    }
}