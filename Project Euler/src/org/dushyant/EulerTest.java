package org.dushyant;

import static org.junit.Assert.*;

import org.junit.Test;

public class EulerTest {


		
	
	@Test
	public void testGetPrimeNumbersBelowGivenNumber_positiveCases() {
//		assertEquals("total 3 prime numbers below 6 ", "[0, 1, 2, 3, 5]", EulerMath.getPrimeNumbersBelowGivenNumber(6));
		assertEquals("total 4 prime numbers below 10 ", "[0, 1, 2, 3, 5, 7]", EulerMath.getPrimeNumbersBelowGivenNumber(10));
	}
	
	@Test
	public void testGetLargestNumberForGivenDigits_positiveCases() {
		assertEquals("the largest 2 digits number is 99 ", 99, EulerMath.getLargestNumberForGivenDigits(2));
		assertEquals("the largest 3 digits number is 999 ", 999, EulerMath.getLargestNumberForGivenDigits(3));
	}
	

	@Test
	public void testIsPalindrome_positiveCases(){
		assertEquals("The procuct is palindrome", true, EulerMath.isPalindrome(1221));
		assertEquals("The procuct is palindrome", true, EulerMath.isPalindrome(32823));
	}

	
	
	
	
	
	
}