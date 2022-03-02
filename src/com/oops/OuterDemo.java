package com.oops;



public class OuterDemo {

	public static void main(String[] args) {
		
			OuterDemo o = new OuterDemo();
			InnerDemo i = o.new InnerDemo();
			i.display();
		
	}
	
	public class InnerDemo{
		
		public void display() {
			
			System.out.println("display called...");
		}
	}
}
