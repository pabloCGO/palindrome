package com.distillery.challenge.utils;

/**
 * 
 * @author PELS
 *
 */
public final class StringUtils {
	
	private StringUtils() {
		
	}
	
	public static void notEmptyString(String text) {
		if (text == null || "".equals(text.trim())) {
			throw new RuntimeException("Empty word is invalid");
		}
	}
	
	public static String getCleanString(String text) {
		return text.replaceAll("\\s+","").toLowerCase();
	}
	
	public static boolean isPalindrome(String word) {
		StringBuilder reverseWord = new StringBuilder(word);
		reverseWord.reverse();
		return word.equals(reverseWord.toString());
	}
	

}
