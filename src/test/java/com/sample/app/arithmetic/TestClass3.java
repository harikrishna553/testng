package com.sample.app.arithmetic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 extends BaseTest {
	@BeforeClass
	public void beforeClass_1() {
		System.out.println("\n********************************");
		System.out.println("TestClass3: Inside before class 1");
	}

	@BeforeClass
	public void beforeClass_2() {
		System.out.println("TestClass3: Inside before class 2");
	}

	@BeforeMethod
	public void beforeMethod_1() {
		System.out.println("\nTestClass3: Inside beforeMethod_1");
	}

	@BeforeMethod
	public void beforeMethod_2() {
		System.out.println("TestClass3: Inside beforeMethod_2");
	}

	@Test
	public void testCase1() {
		System.out.println("TestClass3: testCase1 executing");
	}

	@Test
	public void testCase2() {
		System.out.println("TestClass3: testCase2 executing");
	}

	@AfterMethod
	public void afterMethod_1() {
		System.out.println("TestClass3: Inside afterMethod_1");
	}

	@AfterMethod
	public void afterMethod_2() {
		System.out.println("TestClass3: Inside afterMethod_2");
	}

	@AfterClass
	public void afterClass_1() {
		System.out.println("\nTestClass3: Inside after class 1");
	}

	@AfterClass
	public void afterClass_2() {
		System.out.println("TestClass3: Inside after class 2");
	}

}
