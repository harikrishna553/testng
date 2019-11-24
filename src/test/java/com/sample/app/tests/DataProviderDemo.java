package com.sample.app.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sample.app.arithmetic.Calculator;

public class DataProviderDemo {

	private Calculator calculator = new Calculator();

	@DataProvider(name = "inputCombinations")
	private Object[][] input() {
		return new Object[][] { { 0, 0 }, { -1, -2 }, { 1, -2 }, { -2, 1 }, { 1, 2 } };
	}

	@Test(dataProvider = "inputCombinations")
	public void addTest(int a, int b) {
		int result = calculator.add(a, b);
		System.out.println("Sum of a and b is : " + result);

		assertEquals(result, sum(a, b));
	}

	private static int sum(int a, int b) {
		return a + b;
	}
}