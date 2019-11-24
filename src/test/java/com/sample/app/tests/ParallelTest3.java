package com.sample.app.tests;

import org.testng.annotations.Test;

public class ParallelTest3 {
	@Test
	public void a() {
		System.out.println("ParallelTest3_a is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void b() {
		System.out.println("ParallelTest3_b is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void c() {
		System.out.println("ParallelTest3_c is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void d() {
		System.out.println("ParallelTest3_d is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void e() {
		System.out.println("ParallelTest3_e is executed by : " + Thread.currentThread().getName());
	}
}
