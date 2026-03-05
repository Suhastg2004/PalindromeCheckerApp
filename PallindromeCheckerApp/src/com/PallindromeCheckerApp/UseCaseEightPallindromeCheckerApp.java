/**
 * ============================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Suhas T G
 * @version 8.0
 */

package com.PallindromeCheckerApp;

import java.util.LinkedList;

public class UseCaseEightPallindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";
        
        LinkedList<Character> list = new LinkedList<>();
        
        //Add the elements at the last to maintain the word order
        for (char c : input.toCharArray()) {
            list.addLast(c);
        }

        boolean isPalindrome = true;
        
        //Iterate until the list becomes empty
        while (list.size() > 1) {
            char left = list.removeFirst();
            char right = list.removeLast();
            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}