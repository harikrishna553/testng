package com.sample.app.assertions;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class HardAssertDemo {

	@Test
	public void test1() {
		System.out.println("test1 in execution");
	}

	@Test
	public void test2() {
		System.out.println("Failing the assertion");
		assertTrue(false);
		System.out.println("I am not executed");
	}

	@Test
	public void test3() {
		System.out.println("test3 in execution");
	}

}

