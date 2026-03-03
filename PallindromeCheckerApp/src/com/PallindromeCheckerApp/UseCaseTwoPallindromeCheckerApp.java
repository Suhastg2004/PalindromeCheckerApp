/**
 * ============================================================
 * MAIN CLASS – UseCase2PallindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 
*  - Stores a predefined string
 *  - Compares characters from both ends
 *  - Determines whether the string is a palindrome
 *  - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author  Suhas T G
 * @version 2.0
 */

package com.PallindromeCheckerApp;

public class UseCaseTwoPallindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " +isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}