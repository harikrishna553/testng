package com.sample.app.arithmetic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite_1() {
		System.out.println("Inside beforeSuite_1");
	}

	@BeforeSuite
	public void beforeSuite_2() {
		System.out.println("Inside beforeSuite_2\n");
	}

	@AfterSuite
	public void afterSuite_1() {
		System.out.println("\nInside afterSuite_1");
	}

	@AfterSuite
	public void afterSuite_2() {
		System.out.println("Inside afterSuite_2");
	}

	@BeforeTest
	public void beforeTest_1() {
		System.out.println("---------------------------------\n");
		System.out.println("Inside beforeTest_1");
	}

	@BeforeTest
	public void beforeTest_2() {
		System.out.println("Inside beforeTest_2");
	}

	@AfterTest
	public void afterTest_1() {
		System.out.println("Inside afterTest_1");
	}

	@AfterTest
	public void afterTest_2() {
		System.out.println("Inside afterTest_2");
		System.out.println("---------------------------------\n");
	}
}
