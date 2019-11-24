package com.sample.app.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ReportDemo {

	@Test
	public void A() {
		assertTrue(false);
	}

	@Test
	public void B() {
		assertTrue(true);
	}
}
