package com.sample.app.tests;

import org.testng.annotations.Test;

public class DependentOnMethodsTest1 {

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
	}

	@Test
	public void D() {
		System.out.println("I am in D");
	}
}

