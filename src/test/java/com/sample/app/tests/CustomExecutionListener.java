package com.sample.app.tests;

import org.testng.IExecutionListener;

public class CustomExecutionListener implements IExecutionListener{
	public void onExecutionStart() {
		System.out.println("TestNG about to start execution");
	}
	
	public void onExecutionFinish() {
		System.out.println("All the test cases are executed");
	}
}
