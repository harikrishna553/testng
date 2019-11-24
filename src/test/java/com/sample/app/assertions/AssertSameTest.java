package com.sample.app.assertions;

import static org.testng.Assert.assertSame;

import org.testng.annotations.Test;

public class AssertSameTest {

	@Test
	public void test1() {
		Object obj1 = new Object();
		Object obj2 = new Object();

		assertSame(obj1, obj2, "obj1 and obj2 are not refering to same object");

	}

	@Test
	public void test2() {
		Object obj1 = new Object();
		Object obj2 = obj1;

		assertSame(obj1, obj2);

	}

}
