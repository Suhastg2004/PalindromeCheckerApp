//author @Suhas T G
//version 9.0

package com.PallindromeCheckerApp;

public class UseCaseNinePalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "level";
		boolean isPalindrome = check(input, 0, input.length()-1);
		
		System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
	}
	
	//Recursive method to check for palindrome
	private static boolean check(String s, int start, int end) {
		//If it reaches middle and no char mismatch is found -> Return True
		if(start >= end) return true;
		
		//char mismatch condition
		if(s.charAt(start) != s.charAt(end)) return false;
		
		return check(s, start + 1, end - 1);
	}
}
