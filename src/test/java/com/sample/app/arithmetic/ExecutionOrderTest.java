package com.sample.app.arithmetic;

import org.testng.annotations.Test;

public class ExecutionOrderTest {

	@Test
	public void aTest() {
		System.out.println("a");
	}

	@Test
	public void dTest() {
		System.out.println("d");
	}

	@Test
	public void bTest() {
		System.out.println("b");
	}

	@Test
	public void cTest() {
		System.out.println("c");
	}

	@Test
	public void fTest() {
		System.out.println("f");
	}

	@Test
	public void eTest() {
		System.out.println("e");
	}

}
