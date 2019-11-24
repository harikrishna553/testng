package com.sample.app.arithmetic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AfterClassTest {
	@BeforeClass
	public void beforeClass_1() {
		System.out.println("Inside before class 1");
	}

	@BeforeClass
	public void beforeClass_2() {
		System.out.println("Inside before class 2");
	}

	@Test
	public void testCase1() {
		System.out.println("testCase1 executing");
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2 executing");
	}

	@AfterClass
	public void afterClass_1() {
		System.out.println("Inside after class 1");
	}

	@AfterClass
	public void afterClass_2() {
		System.out.println("Inside after class 2");
	}

}
