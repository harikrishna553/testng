package com.sample.app.tests;

import org.testng.annotations.Test;

public class ParallelTest1 {
	@Test
	public void a() {
		System.out.println("ParallelTest1_a is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void b() {
		System.out.println("ParallelTest1_b is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void c() {
		System.out.println("ParallelTest1_c is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void d() {
		System.out.println("ParallelTest1_d is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void e() {
		System.out.println("ParallelTest1_e is executed by : " + Thread.currentThread().getName());
	}
}
