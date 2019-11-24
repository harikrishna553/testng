package com.sample.app.tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestDemo {

	@Test
	public void a() {
		System.out.println("Going to throw skip exception");
		throw new SkipException("Skipping this test from execution");
	}
	
	@Test
	public void b() {
		System.out.println("I am in b");
	}
}
