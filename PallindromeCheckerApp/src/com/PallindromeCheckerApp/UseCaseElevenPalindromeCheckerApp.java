// author @ Suhas T G
//version 11.0

package com.PallindromeCheckerApp;

public class UseCaseElevenPalindromeCheckerApp {
	public static void main(String[] args) {
		String input = "level";
		boolean isPalindrome = PalindromeService.checkPalindrome(input);
		
		System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
	}
}

class PalindromeService {
	public static boolean checkPalindrome(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
