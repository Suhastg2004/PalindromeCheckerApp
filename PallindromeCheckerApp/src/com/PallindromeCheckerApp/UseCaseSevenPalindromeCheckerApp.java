/**
 * ============================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Suhas T G
 * @version 7.0
 */

package com.PallindromeCheckerApp;

import java.util.ArrayDeque;
import java.util.Deque;

public class UseCaseSevenPalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;
        
        //left and right variable are used to avoid exception
        //in case of deque being empty 
        
        while (deque.size() > 1) {
            char left = deque.removeFirst();
            char right = deque.removeLast();
            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
