package com.oops;

//fully abstract class.....
//by default public abstracrct
//instance variable by defaul public static final/const
// we cna not create non abstract method....
interface TRAI {

		//final variable have to be init....
	int a=10;
	// public abstratc void call()
	void call();

	public abstract void msg();

}

interface GOV {

	float tax();
}

interface StateGOV extends GOV{
	
	void it();
	
}

class jio implements TRAI,StateGOV{

	@Override
	public void call() {

		//a=20;
		System.out.println("jio call method called...."+a);

	}

	@Override
	public void msg() {

		System.out.println("jio msg method called...");

	}

	@Override
	public float tax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void it() {
		// TODO Auto-generated method stub
		
	}

	

}

public class CallTest {

	public static void main(String[] args) {

		System.out.println(TRAI.a);
		TRAI t = new jio();
		GOV g = new jio();

		t.call();
		g.tax();

	}
}
