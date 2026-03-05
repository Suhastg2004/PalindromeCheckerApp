//author @Suhas T G
//version 10.0

package com.PallindromeCheckerApp;

public class UseCaseTenPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "level";
		
		//function to normalize and check for palindrome
		boolean isPalindrome = normalizedCheck(input);
		System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
	}
	
	private static boolean normalizedCheck(String s) {
		
		//Normalize the string using regex
		//[^a-zA-Z] => Not the character a-z or A-Z
		//We use replaceAll(regex, string) to achieve the same
		String normalized = s.replaceAll("[^a-zA-Z]", s);
		
		//Compare from both ends
		for(int i = 0; i < normalized.length()/2; i++) {
			if(normalized.charAt(i) != normalized.charAt(normalized.length()-1-i)) {
				return false;
			}
		}
		
		//return true if no mismatch is found
		return true;
	}
}
