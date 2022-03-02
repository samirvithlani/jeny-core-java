package com.oops.inheritance;

class Shape {

	int height;
	double width;

	void myShape() {

		System.out.println("my shape called....");
	}

}

class Circle extends Shape {

	double pi = 3.14;

	double returnPi() {

		return pi * height + width;
	}

}

class Rect extends Circle {

	double setArea() {

		return pi * height;
	}
}

public class ShapeClient {

	public static void main(String[] args) {

		Rect r = new Rect();
		r.setArea();
		r.returnPi();
		r.myShape();

		Circle c = new Circle();
		c.returnPi();
		c.myShape();

		Shape s = new Shape();
		s.myShape();

	}

}
