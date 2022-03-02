package com.boxing;

public class Demo1 {

	public void getAge(String age) {

		if (age != null) {
			int a = Integer.parseInt(age);
			System.out.println(a);
			
		} else {

			throw new NumberFormatException("Age can not be null");

		}

	}

	public static void main(String[] args) {

		Demo1 d = new Demo1();
		d.getAge("15");
	}
}
