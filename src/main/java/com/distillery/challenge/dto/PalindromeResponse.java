package com.distillery.challenge.dto;

import java.io.Serializable;

public class PalindromeResponse implements Serializable {

	/**
	 * serial UID
	 */
	
	private static final long serialVersionUID = 2151222788155177098L;
	
	private String longerPalindromeValue;
	
	public PalindromeResponse(String longerPalindromeValue) {
		this.longerPalindromeValue = longerPalindromeValue;
	}

	public String getLongerPalindromeValue() {
		return longerPalindromeValue;
	}

	public void setLongerPalindromeValue(String longerPalindromeValue) {
		this.longerPalindromeValue = longerPalindromeValue;
	}
	
	
}
