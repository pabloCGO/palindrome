package com.distillery.challenge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.distillery.challenge.dto.PalindromeResponse;
import com.distillery.challenge.service.PalindromeService;

/**
 * 
 * @author PELS
 *
 */
@RestController
public class PalindromeController {
	
	@Autowired
	private PalindromeService palindromeService;

	@GetMapping(value= "/getMaxPalindrome", produces = "application/json")
	public PalindromeResponse getMaxPalindrome(@RequestParam(name = "word") String word) {
		String longerPalindrome = palindromeService.getMaxPalindrome(word);
		return new PalindromeResponse(longerPalindrome);
	}
	
}
