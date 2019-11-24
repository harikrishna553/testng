package com.sample.app.tests;

import org.testng.annotations.Test;

public class ParallelTest2 {
	@Test
	public void a() {
		System.out.println("ParallelTest2_a is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void b() {
		System.out.println("ParallelTest2_b is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void c() {
		System.out.println("ParallelTest2_c is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void d() {
		System.out.println("ParallelTest2_d is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void e() {
		System.out.println("ParallelTest2_e is executed by : " + Thread.currentThread().getName());
	}
}
