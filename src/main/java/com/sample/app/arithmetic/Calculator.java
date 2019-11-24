package com.sample.app.arithmetic;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int remainder(int a, int b) {
		return a % b;
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	public boolean isOdd(int number) {
		return number % 2 != 0;
	}
}
