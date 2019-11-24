package com.sample.app.arithmetic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassTest {

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

}