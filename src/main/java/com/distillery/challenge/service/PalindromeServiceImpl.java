package com.distillery.challenge.service;

import org.springframework.stereotype.Service;

import com.distillery.challenge.utils.StringUtils;

/**
 * 
 * @author PELS
 *
 */
@Service
public class PalindromeServiceImpl implements PalindromeService {

	@Override
	public String getMaxPalindrome(String text) {
		StringUtils.notEmptyString(text);
		String newText = StringUtils.getCleanString(text);
		if(newText.length() == 1) {
			return newText;
		} else {
			return findMaxPalindrome(newText);
		}
	}
	
	private String findMaxPalindrome(String word) {
		String maxPalindrome = "";
		for (int i = 0; i <= word.length(); ++i) {
			for (int j = 0; j <= word.length() - i; j++) {
				String candidateString = word.substring(j, i + j);
				if (StringUtils.isPalindrome(candidateString) && 
						candidateString.length() >= maxPalindrome.length()) {
					maxPalindrome = candidateString;
				}
			}
		}
		return maxPalindrome;
	}

}
