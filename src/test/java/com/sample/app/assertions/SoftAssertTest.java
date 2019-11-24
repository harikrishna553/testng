package com.sample.app.assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void test1() {
		System.out.println("test1 in execution");
	}

	@Test
	public void test2() {
		SoftAssert softAssert = new SoftAssert();

		System.out.println("Failing the assertion");
		softAssert.assertTrue(false);
		System.out.println("I will get executed");

		softAssert.assertAll();
	}

	@Test
	public void test3() {
		System.out.println("test3 in execution");
	}

}