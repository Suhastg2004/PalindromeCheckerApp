//author @ Suhas T G
//version 13.0

package com.PallindromeCheckerApp;

import java.util.*;

public class UseCaseThriteenPalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        long t1 = time(() -> twoPointer(input));
        long t2 = time(() -> reverseString(input));
        long t3 = time(() -> charArrayCheck(input));
        long t4 = time(() -> stackCheck(input));
        long t5 = time(() -> queueStackCheck(input));
        long t6 = time(() -> dequeCheck(input));
        long t7 = time(() -> linkedListCheck(input));
        long t8 = time(() -> recursionCheck(input));

        System.out.println("UC13: Performance Comparison (ns)");
        System.out.println("Input: " + input);
        System.out.println("1. Two Pointer                : " + t1);
        System.out.println("2. Reverse String             : " + t2);
        System.out.println("3. Char Array Two Pointer     : " + t3);
        System.out.println("4. Stack                      : " + t4);
        System.out.println("5. Queue + Stack              : " + t5);
        System.out.println("6. Deque                      : " + t6);
        System.out.println("7. Linked List (built-in)     : " + t7);
        System.out.println("8. Recursion                  : " + t8);
    }

    interface RunCheck { boolean run(); }

    static long time(RunCheck r) {
        long start = System.nanoTime();
        r.run();
        return System.nanoTime() - start;
    }

    static boolean twoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) { if (s.charAt(i) != s.charAt(j)) return false; i++; j--; }
        return true;
    }

    static boolean reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
        return s.equals(r);
    }

    static boolean charArrayCheck(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while (i < j) { if (a[i] != a[j]) return false; i++; j--; }
        return true;
    }

    static boolean stackCheck(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) st.push(c);
        for (char c : s.toCharArray()) if (c != st.pop()) return false;
        return true;
    }

    static boolean queueStackCheck(String s) {
        Queue<Character> q = new LinkedList<>();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) { q.add(c); st.push(c); }
        while (!q.isEmpty()) if (!q.remove().equals(st.pop())) return false;
        return true;
    }

    static boolean dequeCheck(String s) {
        Deque<Character> d = new ArrayDeque<>();
        for (char c : s.toCharArray()) d.addLast(c);
        while (d.size() > 1) if (d.removeFirst() != d.removeLast()) return false;
        return true;
    }

    static boolean linkedListCheck(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) list.add(c);
        int i = 0, j = list.size() - 1;
        while (i < j) { if (!list.get(i).equals(list.get(j))) return false; i++; j--; }
        return true;
    }

    static boolean recursionCheck(String s) {
        return rec(s, 0, s.length() - 1);
    }

    static boolean rec(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return rec(s, i + 1, j - 1);
    }
}
