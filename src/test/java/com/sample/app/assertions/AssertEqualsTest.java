package com.sample.app.assertions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.sample.app.arithmetic.Calculator;

public class AssertEqualsTest {

	private Calculator calc = new Calculator();

	@Test
	public void add_1And2_3() {
		assertEquals(calc.add(1, 2), 3);
	}

	@Test
	public void failMe() {
		assertEquals(true, false, "Failing the test case");
	}
}
