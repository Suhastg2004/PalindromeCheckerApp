/**
 * ============================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Suhas T G
 * @version 3.0
 */
package com.PallindromeCheckerApp;

public class UseCaseThreePallindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madm";

        // Build reversed string using a loop (String concatenation)
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);

        boolean isPalindrome = input.equals(reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

