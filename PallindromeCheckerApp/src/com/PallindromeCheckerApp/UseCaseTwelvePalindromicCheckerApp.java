//author @Suhas T G
//version 12.0

package com.PallindromeCheckerApp;

import java.util.*;

public class UseCaseTwelvePalindromicCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";

        PalindromeContext context = new PalindromeContext(new StackStrategy());
        System.out.println("Using StackStrategy -> " + context.execute(input));

        context.setStrategy(new DequeStrategy());
        System.out.println("Using DequeStrategy -> " + context.execute(input));
    }
}

interface PalindromeStrategy{
    boolean check(String input);
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

class StackStrategy implements PalindromeStrategy{
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c: input.toCharArray()) {
            stack.push(c);
        }
        for(char c: input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy{
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            char left = deque.removeFirst();
            char right = deque.removeLast();
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}