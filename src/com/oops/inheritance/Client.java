package com.oops.inheritance;

import java.util.Scanner;

//child class can use prop of parent class called inheritance...
//single,multypule,multylevel,hy,hybride
//:,extends key keyword
//reusablity 

class Vehile {

	int makeYear;
	String engName;

}

class Car extends Vehile {

	void getCarData() {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter car make year");
		makeYear = sc.nextInt();
		System.out.println("pls enter car engine name");
		engName = sc.next();
	}

	void printCarData() {

		System.out.println("car make year = " + makeYear);
		System.out.println("car engine name  = " + engName);
	}
}

public class Client {

	public static void main(String[] args) {

		Car c = new Car();
		c.getCarData();
		c.printCarData();

	}

}
