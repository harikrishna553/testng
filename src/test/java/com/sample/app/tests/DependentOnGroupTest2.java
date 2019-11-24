package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependentOnGroupTest2 {
	@Test(groups = { "group2" })
	public void A() {
		System.out.println("I am in A");
	}

	@Test(groups = { "group2" })
	public void B() {
		System.out.println("I am in B");
	}

	@Test(dependsOnGroups = { "group2" })
	public void C() {
		System.out.println("I am in C");
	}

	@Test(groups = { "group2" })
	public void D() {
		System.out.println("I am in D");
		assertTrue(false);
	}
}
