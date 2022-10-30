package com.selenium;

public class Sample1 {

	static {
		System.out.println("this is static block");
	}

	static void method() {
		System.out.println("this is staic method 123");
	}

	public void normalmethod() {
		System.out.println("THis is normal method");

	}

	public static void main(String[] args) {

		Sample1 s = new Sample1();
		method();
		s.normalmethod();
	}

}
