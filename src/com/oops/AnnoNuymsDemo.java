package com.oops;

interface Payable {

	void pay();
	void say();
}

public class AnnoNuymsDemo {

	public static void main(String[] args) {

		Payable p = new Payable() {

			@Override
			public void pay() {
				
				System.out.println("displayed..");

			}

			@Override
			public void say() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
