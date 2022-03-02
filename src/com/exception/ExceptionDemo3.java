package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	int demo1() {

		return 1;
	}
	//1

	int demo2() {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		// user insert string here...
		
		return 2;
	}

	int demo3() {

		int c = demo1();
		return c;
	}

	public static void main(String[] args) {

		ExceptionDemo3 obj = new ExceptionDemo3();
		try {

			System.out.println(obj.demo1());

		} catch (InputMismatchException e) {

			System.out.println(obj.demo1());
			System.out.println(obj.demo2());

		} catch (ArithmeticException e) {

			System.out.println(obj.demo3());
			System.out.println(obj.demo1());

		} catch (Exception e) {
			System.out.println("ERROR");
		} finally {

			System.out.println(obj.demo1());
			System.out.println(obj.demo2());
			System.out.println(obj.demo3());
		}

	}

}
