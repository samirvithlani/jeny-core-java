package com.oops.abstraction;

abstract class Drink {

	abstract void drinking();

}

abstract class Water extends Drink {

}

class Milk extends Water {

	@Override
	void drinking() {
		// TODO Auto-generated method stub

	}
}

public class DrinkDemo {

}
