package com.sample.app.tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The name of the testcase failed but within success percentage :" + result.getName());
	}
}
