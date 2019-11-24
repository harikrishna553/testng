package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependentOnMethodsTest2 {

	@Test(dependsOnMethods = { "B", "C", "D" })
	public void A() {
		System.out.println("I am in A");
	}

	@Test
	public void B() {
		System.out.println("I am in B");
	}

	@Test
	public void C() {
		System.out.println("I am in C");
		assertTrue(false);
	}

	@Test
	public void D() {
		System.out.println("I am in D");
	}
}

