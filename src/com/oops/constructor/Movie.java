package com.oops.constructor;

//constructor is special function which has same name as class name
// 2 types
// default and param
//constrctor does not have return type....
public class Movie {

	Movie() {

		System.out.println("default const called....");
	}

	Movie(int x) {

		System.out.println("param " + x);
	}

	public static void main(String[] args) {

		Movie m = new Movie(15);
		Movie m1 = new Movie();
	}
}
