package com.sample.app.tests;

import org.testng.annotations.Test;

public class DependentOnGroupTest1 {
	@Test(groups = { "group1" })
	public void A() {
		System.out.println("I am in A");
	}

	@Test(groups = { "group1" })
	public void B() {
		System.out.println("I am in B");
	}

	@Test(dependsOnGroups = { "group1" })
	public void C() {
		System.out.println("I am in C");
	}

	@Test(groups = { "group1" })
	public void D() {
		System.out.println("I am in D");
	}
}
