package com.sample.app.assertions;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.sample.app.arithmetic.Calculator;

public class AssertFalseTest {
	private Calculator calc = new Calculator();

	@Test
	public void isEven_4_true() {
		assertFalse(!calc.isEven(4));
	}

	@Test
	public void isEven_5_false() {
		assertFalse(calc.isEven(5));
	}

	@Test
	public void failMe() {
		assertFalse(true, "Failing the test case");
	}
}
