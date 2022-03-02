package com.exception;

public class ExceptionDemo5 {

	public void name(String name) {
		
		
		if(name.length()<5) {
			
			throw new RuntimeException("name len is not valid...");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		ExceptionDemo5 e1 = new ExceptionDemo5();
		try {
		e1.name("ab");
		}catch (RuntimeException e) {
		
			System.out.println(e.getMessage());
		}
		
	}
}
