package com.sample.app.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase skipped is :" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The name of the testcase on test failed but within success percentage :" + result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test failed with time out :" + result.getName());
	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished : " + context.getName());
	}
}
