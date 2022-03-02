package com.oops.lambda;

@FunctionalInterface
interface Call {

	void calling();

}

public class LambdaDemo1 {

	public static void main(String[] args) {

		Call c = () -> {

			System.out.println("calling...");
		};
		c.calling();
	}

}
