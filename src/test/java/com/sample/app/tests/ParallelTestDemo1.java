package com.sample.app.tests;

import org.testng.annotations.Test;

public class ParallelTestDemo1 {

	@Test
	public void a() {
		System.out.println("a is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void b() {
		System.out.println("b is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void c() {
		System.out.println("c is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void d() {
		System.out.println("d is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void e() {
		System.out.println("e is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void f() {
		System.out.println("f is executed by : " + Thread.currentThread().getName());
	}

	@Test
	public void g() {
		System.out.println("g is executed by : " + Thread.currentThread().getName());
	}

}
