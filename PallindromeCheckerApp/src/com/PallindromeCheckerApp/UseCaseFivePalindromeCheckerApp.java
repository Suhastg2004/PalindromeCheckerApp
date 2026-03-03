/**
 * ============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Suhas T G
 * @version 5.0
 */
package com.PallindromeCheckerApp;

import java.util.Stack;

public class UseCaseFivePalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "noon";
		Stack<Character> stack = new Stack<>();
		
		//Push each character to the stack
		for(char c: input.toCharArray()) {
			stack.push(c);
		}
		
		boolean isPalindrome = true;
		
		//Iterate again through original string -> Pop and compare
		for(char c: input.toCharArray()) {
			if (c != stack.pop()) {
				isPalindrome = false;
			}
		}
		System.out.println("Input: " + input);
		System.out.println("Is Pallindrome? : " + isPalindrome);
	}
}
