package com.oops;

class Parent {

	void search() {

	}
}

public class OverLoadingDemo extends Parent {

	// method with same name but diff arguments/params

	void search() {

		System.out.println("search called...");
	}

	int search(int qty) {

		System.out.println(qty);

		return qty;
	}

	String search(int price, String name) {

		return name;
	}

	String search(long l) {

		System.out.println("l");

		return "ok";
	}

	public static void main(String[] args) {

		OverLoadingDemo o = new OverLoadingDemo();
		o.search(8460224296l);
		o.search(15, "bb");
	}

}
