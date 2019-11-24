package com.sample.app.tests;

import org.testng.annotations.Test;

public class IgnoreTests {

	@Test(enabled = false)
	public void test1() {
		System.out.println("test1 in execution");
	}

	@Test
	public void test2() {
		System.out.println("test2 in execution");
	}

}