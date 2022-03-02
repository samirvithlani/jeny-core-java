package com.oops.ploy;

class Shape {

	int area() {

		System.out.println("Shape method called....");
		return 0;

	}
}

class Circle extends Shape {

	int area() {

		System.out.println("circle method called....");
		return 0;
	}

}

//parent class refe and child class object/memory
public class ShapeClient {

	public static void main(String[] args) {

		Shape s = new Circle();
		s.area();

	}

}
