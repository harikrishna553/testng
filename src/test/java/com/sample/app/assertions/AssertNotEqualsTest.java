package com.sample.app.assertions;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertNotEqualsTest {
	@Test
	public void test1() {
		assertNotEquals(2, 3);
	}

	@Test
	public void test2() {
		assertNotEquals(2, 2, "2 is equal to 2");
	}
}
