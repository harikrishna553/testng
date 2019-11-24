package com.sample.app.assertions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.sample.app.arithmetic.Calculator;

public class AsserTrueTest {
	private Calculator calc = new Calculator();

	@Test
	public void isEven_4_true() {
		assertTrue(calc.isEven(4));
	}

	@Test
	public void isEven_5_false() {
		assertTrue(!calc.isEven(5));
	}
	
	@Test
	public void failMe() {
		assertTrue(false, "Failing the test case");
	}
}
