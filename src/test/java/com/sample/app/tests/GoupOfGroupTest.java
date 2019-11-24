package com.sample.app.tests;

import org.testng.annotations.Test;

public class GoupOfGroupTest {
	@Test(groups = { "performanceTest" })
	public void performanceTest_1() {
		System.out.println("performanceTest 1");
	}

	@Test(groups = { "performanceTest" })
	public void performanceTest_2() {
		System.out.println("performanceTest 2");
	}

	@Test(groups = { "unitTest" })
	public void unitTest_1() {
		System.out.println("unitTest 1");
	}

	@Test(groups = { "unitTest" })
	public void unitTest_2() {
		System.out.println("unitTest 2");
	}

	@Test(groups = { "serviceTest" })
	public void serviceTest_1() {
		System.out.println("serviceTest 1");
	}

	@Test(groups = { "serviceTest" })
	public void serviceTest_2() {
		System.out.println("serviceTest 2");
	}

	@Test(groups = { "memoryTest" })
	public void memoryTest_1() {
		System.out.println("memoryTest 1");
	}

	@Test(groups = { "memoryTest" })
	public void memoryTest_2() {
		System.out.println("memoryTest 2");
	}

}
