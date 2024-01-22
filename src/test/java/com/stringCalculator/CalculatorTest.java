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

}