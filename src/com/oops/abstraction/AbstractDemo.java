package com.oops.abstraction;

// y
// y
// RANG - 0 to 100 %
//all 100 %
// %
abstract class Abs {

	public Abs() {

		System.out.println("abs............");

	}

	abstract void change();

	abstract void change1();

	void non() {

		System.out.println("");
	}

}

public class AbstractDemo extends Abs {

	public static void main(String[] args) {

		Abs a = new AbstractDemo();
		a.change();

	}

	@Override
	void change() {

		System.out.println("change...");

	}

	@Override
	void change1() {
		// TODO Auto-generated method stub

	}
}
