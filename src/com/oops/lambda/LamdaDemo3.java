package com.oops.lambda;

interface Name {

	String naming(String name);
}
interface Calc{
	
	int sum(int a,int b);
}

public class LamdaDemo3 {

	public static void main(String[] args) {

		Name n = (name) -> {

			return name.toUpperCase();

		};
		System.out.println(n.naming("samir"));
		
		
		Calc c = (x,y)->{
			
			return x + y;
		};
		
		System.out.println(c.sum(10, 20));
		
	}
}
