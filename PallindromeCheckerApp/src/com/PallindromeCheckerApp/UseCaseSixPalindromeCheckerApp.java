/**
 * ============================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Suhas T G
 * @version 6.0
 */
package com.PallindromeCheckerApp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCaseSixPalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "civic";

        // Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue / Push
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Dequeue vs Pop comparison
        while (!queue.isEmpty()) {
            Character q = queue.remove(); // or poll()
            Character s = stack.pop();
            if (!q.equals(s)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}