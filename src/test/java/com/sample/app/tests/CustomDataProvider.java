package com.sample.app.tests;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	@DataProvider(name = "inputCombinations")
	private Object[][] input() {
		return new Object[][] { { 0, 0 }, { -1, -2 }, { 1, -2 }, { -2, 1 }, { 1, 2 } };
	}
}
