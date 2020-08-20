package com.distillery.challenge.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author PLOPEZEE
 *
 */
public class StringUtilsTest {
	
	@Test
	public void isPalindromeTest() {
		assertTrue(StringUtils.isPalindrome("anitalavalatina"));
		assertTrue(StringUtils.isPalindrome("oso"));
		assertTrue(StringUtils.isPalindrome("ana"));
		assertFalse(StringUtils.isPalindrome("otherword"));
	}
	
	@Test
	public void g0etCleanStringTest() {
		assertEquals("stringwithlotsofspaces", StringUtils.getCleanString(" string with lots of spaces"));	
		assertEquals("abcde", StringUtils.getCleanString(" a b     c  d  e "));
	}
	
    @Test()
	public void notEmptyStringExceptionNullValue() {
		assertThrows(RuntimeException.class, () -> {
			StringUtils.notEmptyString(null);
		});
	}
    
    @Test()
	public void notEmptyStringExceptionEmptyValue() {
		assertThrows(RuntimeException.class, () -> {
			StringUtils.notEmptyString("             ");
		});
	}


}
