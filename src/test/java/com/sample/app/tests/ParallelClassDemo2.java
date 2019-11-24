package com.sample.app.tests;

import org.testng.annotations.Test;

public class ParallelClassDemo2 {
	@Test
	public void a() {
		System.out.println("ParallelClassDemo2_a is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void b() {
		System.out.println("ParallelClassDemo2_b is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void c() {
		System.out.println("ParallelClassDemo2_c is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void d() {
		System.out.println("ParallelClassDemo2_d is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void e() {
		System.out.println("ParallelClassDemo2_e is executed by : " + Thread.currentThread().getName());
	}
}
