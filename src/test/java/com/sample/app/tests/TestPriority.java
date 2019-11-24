package com.sample.app.tests;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 2)
	public void A() {
		System.out.println("Inside A");
	}

	@Test
	public void B() {
		System.out.println("Inside B");
	}

	@Test(priority = 3)
	public void C() {
		System.out.println("Inside C");
	}

	@Test(priority = 1)
	public void D() {
		System.out.println("Inside D");
	}

	@Test(priority = 4)
	public void E() {
		System.out.println("Inside E");
	}
}
