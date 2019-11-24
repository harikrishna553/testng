package com.sample.app.tests;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = { "group1" })
	public void group1A() {
		System.out.println("I am in group1 test A");
	}

	@Test(groups = { "group1" })
	public void group1B() {
		System.out.println("I am in group1 test B");
	}

	@Test(groups = { "group2" })
	public void group2A() {
		System.out.println("I am in group2 test A");
	}

	@Test(groups = { "group2" })
	public void group2B() {
		System.out.println("I am in group2 test B");
	}

	@Test(groups = { "group3" })
	public void group3A() {
		System.out.println("I am in group3 test A");
	}

	@Test(groups = { "group3" })
	public void group3B() {
		System.out.println("I am in group3 test B");
	}
}
