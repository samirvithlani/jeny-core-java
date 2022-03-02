package com.oops.lambda;

@FunctionalInterface
interface Shaping {

	void shape(int height, int width);
}

public class LamdaDemo2 {

	
	public static void main(String[] args) {
		
		Shaping s = (height,width)->{
			
			System.out.println("HEIGHT = "+height+" - "+width);
		};
		s.shape(100, 200);
	}
}
