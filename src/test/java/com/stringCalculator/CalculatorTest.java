package com.stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import stringcctdd.StringCalculator;

public class CalculatorTest {
	
	//	Task - 1: Create a simple String calculator with a method signature:
	//	———————————————
	//	int Add(string numbers)
	//	———————————————
	// TODO: for empty string it will return zero
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	// TODO: for single string it will return same string
	@Test
	public void shouldReturnNumberOnSingleString() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	// TODO: for two strings separated by commas it will return sum of the two
	@Test
	public void shouldReturnSumOfNumbersOnTwoStrings() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	
	//	Task - 2: Allow the Add method to handle an unknown amount of numbers
	//	TODO: for multiple strings separated by commas it will return sum of all
	@Test
	public void shouldReturnSumOfAllNumbers() {
		assertEquals(6,StringCalculator.add("1,2,3"));
	}


	//	Task - 3: Allow the Add method to handle new lines between numbers (instead of commas)
	//	TODO: Allow \n as delimiter along-with comma
	@Test
	public void shouldAllowNewLineAsDelimiter() {
		assertEquals(6,StringCalculator.add("1\n2,3"));
	}
	
	

	//	Task - 4: Support different delimiters
	//	TODO: Allow custom delimiter by checking // in beginning of first line
	@Test
	public void shouldAllowCustomDelimiter() {
		assertEquals(3,StringCalculator.add("//;\n1;2"));
	}

	//	TODO: Custom Delimiter can be custom Regex Character
	@Test
	public void shouldAllowRegexCharAsCustomDelimiter() {
		assertEquals(3,StringCalculator.add("//.\n1.2"));
	}



	//	Task - 5: Throw Exception for negative numbers
	//	TODO: Throw exception for negative numbers
	@Test
	public void shouldThrowExceptionForNegativeNumbers() {
		try{
			StringCalculator.add("1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
		}
	}

	//	TODO: Exception message should have negative number
	@Test
	public void shouldHaveNegativeNumbersInException() {
		try{
			StringCalculator.add("-1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
			assertEquals("negatives not allowed: -1, -2",e.getMessage());
		}
	}

}