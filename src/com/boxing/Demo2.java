package com.boxing;

class Parent {

	public final void demo1() {

		System.out.println("called...");
	}
}

public class Demo2 extends Parent{

	public final void demo12() {

		System.out.println("called...");
	}

	public static void main(String[] args) {

		// Wrapper class

		// int -->Integer
		String b = "false";
		boolean b1 = Boolean.parseBoolean(b);
		System.out.println(b1);

		String f = "12.55f";
		float f1 = Float.parseFloat(f);
		System.out.println(f1);

		String d = "1234567.25";
		double d1 = Double.parseDouble(d);
		System.out.println(d1);

		Demo2 demo = new Demo2();
		demo.demo1();

	}
}
