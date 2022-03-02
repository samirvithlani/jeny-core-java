package com.oops.constructor;

public class ThisDemo {

	int amount = 100;

	void calc() {

		int amount = 0;
		System.out.println("amount" + amount);
		System.out.println(this.amount);

	}

	public static void main(String[] args) {

		ThisDemo t = new ThisDemo();
		t.calc();
	}
}
