package com.distillery.challenge;

public class Palindrome {

	public String getMaxPalindrome(String text) {
		if (text == null || "".equals(text)) {
			throw new RuntimeException("Empty word is invalid");
		}
		else if(text.length() == 1) {
			return text;
		} else {
			return findMaxPalindrome(text);
		}
	}
	
	private boolean isPalindrome(String word) {
		StringBuilder reverseWord = new StringBuilder(word);
		reverseWord.reverse();
		return word.equals(reverseWord.toString());
	}
	
	public String findMaxPalindrome(String word) {
		String maxPalindrome = "";
		for (int i = 2; i <= word.length(); ++i) {
			for (int j = 0; j <= word.length() - i; j++) {
				String candidateString = word.substring(j, i + j);
				System.out.println(candidateString);
				if (isPalindrome(candidateString) && candidateString.length() >= maxPalindrome.length()) {
					maxPalindrome = candidateString;
				}
			}
		}
		return maxPalindrome;
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		String xd = p.getMaxPalindrome("obo");
		System.out.println("max palindrome is = " + xd);
	}
}
