package com.oops.lambda;

interface Message{
	
	void messaging();
	
}

//depedancy....
public class WithoutLambda implements Message {

	
	
	public static void main(String[] args) {
		
		Message m = new WithoutLambda();
		m.messaging();
	}

	@Override
	public void messaging() {
		
		System.out.println("doing message......");
		
	}
}
