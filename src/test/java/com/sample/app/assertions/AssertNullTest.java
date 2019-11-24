package com.sample.app.assertions;

import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class AssertNullTest {

	@Test
	public void test1() {
		Object obj = null;
		assertNull(obj);
	}

	@Test
	public void test2() {
		Object obj = new Object();
		assertNull(obj, "obj is not null");
	}
}
