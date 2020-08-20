package com.distillery.challenge.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeServiceImplTest {
	
	private PalindromeService palindromeService = new PalindromeServiceImpl();

	@Test
	public void is() {
		assertEquals("anitalavalatina", palindromeService.getMaxPalindrome("anitalavalatina"));
		assertEquals("mygym", palindromeService.getMaxPalindrome("My gym"));
		assertEquals("ablewasiereisawelba", palindromeService.getMaxPalindrome("Able was I ere I saw Elba"));
	}
	
}
