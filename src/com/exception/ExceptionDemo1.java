package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	void demo() {

		System.out.println("demo called,,,");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter no 1");
			int a = sc.nextInt();
			System.out.println("enter no 2");
			int b = sc.nextInt();

			int c = a / b;
			System.out.println(c);
		}

		catch (ArithmeticException e) {

			e.printStackTrace();
			System.out.println("Can not divide by ZERO");
		} catch (InputMismatchException e) {

			e.printStackTrace();
			System.out.println("pls check your input...");
		} catch (Exception e) {

			System.out.println("error....");
		} finally {

			System.out.println("cleaning logic");
			System.out.println("all clear.....");
			// ExceptionDemo1 e1 = new ExceptionDemo1();
			// e1.demo();
		}
	}
}
