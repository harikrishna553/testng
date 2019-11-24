package com.sample.app.assertions;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class AssertNotNullTest {

	@Test
	public void test1() {
		Object obj = null;
		assertNotNull(obj, "obj is null");
	}

	@Test
	public void test2() {
		Object obj = new Object();
		assertNotNull(obj);
	}
}
