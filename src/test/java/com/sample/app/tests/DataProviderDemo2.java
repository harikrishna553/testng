package com.sample.app.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.sample.app.arithmetic.Calculator;

public class DataProviderDemo2 {

	private Calculator calculator = new Calculator();

	@Test(dataProvider = "inputCombinations", dataProviderClass = CustomDataProvider1.class)
	public void negativeValues(int a, int b) {
		int result = calculator.add(a, b);
		System.out.println("Sum of a and b is : " + result);

		assertEquals(result, sum(a, b));
	}

	@Test(dataProvider = "inputCombinations", dataProviderClass = CustomDataProvider1.class)
	public void positiveValues(int a, int b) {
		int result = calculator.add(a, b);
		System.out.println("Sum of a and b is : " + result);

		assertEquals(result, sum(a, b));
	}

	private static int sum(int a, int b) {
		return a + b;
	}
}