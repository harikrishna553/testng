package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultDemo {

	@Test
	public void test1() {
		assertTrue(false);
	}

	@Test
	public void test2() {
		assertTrue(true);
	}

	@Test
	public void test3() {
		assertTrue(false);
	}

	@Test
	public void test4() {
		assertTrue(true);
	}

	@AfterMethod
	public void logResult(ITestResult itestResult) {
		String methodName = itestResult.getMethod().getMethodName();

		if (itestResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("*****" + methodName + " passed*****");
		}

		if (itestResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("*****" + methodName + " failed*****");
		}
	}

}
