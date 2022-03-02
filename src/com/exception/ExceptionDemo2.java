package com.exception;

public class ExceptionDemo2 {

	public void demo1() {

		//int c = 10 / 1;
		//System.out.println(c);
		//return 1;
	}

	public int demo2() {

		return 2;
	}

	public int demo3() {

		return 3;
	}

	public static void main(String[] args) {

		ExceptionDemo2 obj = new ExceptionDemo2();
		try {

			//System.out.println(obj.demo1());
			obj.demo1();

		} catch (ArithmeticException e) {

			System.out.println(obj.demo2());
			
		} finally {

			System.out.println(obj.demo3());
		}

	}
}
