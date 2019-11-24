package com.sample.app.assertions;

import static org.testng.Assert.assertNotSame;

import org.testng.annotations.Test;

public class AssertNotSameTest {

	@Test
	public void test1() {
		Object obj1 = new Object();
		Object obj2 = new Object();

		assertNotSame(obj1, obj2);

	}

	@Test
	public void test2() {
		Object obj1 = new Object();
		Object obj2 = obj1;

		assertNotSame(obj1, obj2, "obj1 and obj2 are refering to same object");

	}
}
