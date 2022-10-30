package com.selenium;

public class Sample {

	public static void staticMethod() {

		System.out.println("Static method");
	}
	
	static {
		int a=5;
		int b=5;
		int c =a+b;
		System.out.println(c);
		
		
		System.out.println("static block");}

	public void method1() {

		System.out.println("normal method");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		

		s.method1();

		// Sample.staticMethod();
	}

}
