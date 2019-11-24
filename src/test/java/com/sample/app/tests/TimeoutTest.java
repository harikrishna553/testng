package com.sample.app.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class TimeoutTest {

	@Test(timeOut = 5000)
	public void test1() {
		System.out.println("Going to sleep for 6 seconds");

		try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			System.out.println("In catch block : " + e.getMessage());
		}

	}

}
