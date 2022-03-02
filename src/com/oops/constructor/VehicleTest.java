package com.oops.constructor;

public class VehicleTest {

	public static void main(String[] args) {

		// classLoader will load class in memory....
		Car c = new Car();
		c.demo();
	}
}

class Vehicle {

	int a=90; // veh ins a
	int b=90;
	int vehpr;

	Vehicle() {
		// TODO Auto-generated constructor stub
	}

	Vehicle(int p) {

		System.out.println("veh const... def...");
	}
}

class Car extends Vehicle {

	int a=100; // car ins a

	Car() {
		super(1500);
		System.out.println("default const of car....");
	}

	void demo() {
		
		System.out.println(super.a);
		System.out.println(super.b);
	}

	// vehpr;
}
