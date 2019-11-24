package com.sample.app.tests;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	int count = 0;

	@Test(invocationCount = 5)
	public void a() {
		count++;
		System.out.println("Invoked count : " + count);
	}
}
