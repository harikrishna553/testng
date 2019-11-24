package com.sample.app.tests;

import org.testng.annotations.Test;

public class InvocationCountParallelTest {

	@Test(invocationCount = 10, threadPoolSize = 3)
	public void a() {
		System.out.println("Executed by " + Thread.currentThread().getName());
	}
}
