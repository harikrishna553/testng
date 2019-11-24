package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomTestListener.class)
public class CustomTestListenerDemo {
	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside after test");
	}

	@Test
	public void test1() {
		System.out.println("Inisde test 1");
	}

	@Test
	public void test2() {
		System.out.println("Inisde test 2");
	}

	@Test
	public void test3() {
		throw new SkipException("test3 is skipped");
	}

	int i = 0;

	@Test(successPercentage = 50, invocationCount = 5)
	public void test4() {
		i++;
		System.out.println("Inisde test 4, invocation count : " + i);

		if (i % 2 == 0) {
			assertTrue(false);
		}
	}

}
