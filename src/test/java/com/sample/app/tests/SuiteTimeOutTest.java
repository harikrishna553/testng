package com.sample.app.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class SuiteTimeOutTest {

	@Test(timeOut = 7000)
	public void test1() {
		System.out.println("Going to sleep for 6 seconds");

		try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			System.out.println("In catch block : " + e.getMessage());
		}

	}

	@Test
	public void test2() {
		System.out.println("Going to sleep for 4 seconds");

		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			System.out.println("In catch block : " + e.getMessage());
		}

	}

	@Test
	public void tes3() {
		System.out.println("Going to sleep for 2 seconds");

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			System.out.println("In catch block : " + e.getMessage());
		}

	}

}
