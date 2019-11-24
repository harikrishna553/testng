package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class SuccessPercentageDemo {
	int count = 0;

	@Test(invocationCount = 5, successPercentage = 50)
	public void a() {
		count++;
		System.out.println("Invoked count : " + count);

		if (count % 2 == 0) {
			assertTrue(false);
		} else {
			assertTrue(true);
		}
	}
}
