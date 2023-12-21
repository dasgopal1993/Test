package com.example.Test;


import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

	@Test
	public void testCalculateFactorial() {
		// Test case for calculating the factorial of 5
		int result = FactorialCalculator.calculateFactorial(5);
		String test;

		// The expected result is 5! = 120
		assertEquals(120, result);
	}

	@Test
	public void testCalculateFactorialOfZero() {
		// Test case for calculating the factorial of 0
		int result = FactorialCalculator.calculateFactorial(0);

		// The factorial of 0 is 1
		assertEquals(1, result);
	}

	@Test
	public void testCalculateFactorialOfOne() {
		// Test case for calculating the factorial of 1
		int result = FactorialCalculator.calculateFactorial(1);

		// The factorial of 1 is 1
		assertEquals(1, result);
	}
}
