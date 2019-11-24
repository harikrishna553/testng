package com.sample.app.tests;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class CustomDataProvider1 {

	@DataProvider(name = "inputCombinations")
	private Object[][] input(Method method) {
		if (method.getName().equals("negativeValues")) {
			return new Object[][] { { -1, -2 }, { 1, -2 }, { -2, 1 } };
		} else if (method.getName().equals("positiveValues")) {
			return new Object[][] { { 11, 12 }, { 14, 15 } };
		}
		return null;

	}

}