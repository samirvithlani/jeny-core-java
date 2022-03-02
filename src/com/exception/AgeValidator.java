package com.exception;

public class AgeValidator {

	public void checkAge(int age) throws InvalidAgeException {
		
		
		if(age<18) {
			
			throw new InvalidAgeException("age is not valid...");
		}
	}
	
	public static void main(String[] args) {
		
		AgeValidator a= new AgeValidator();
		try {
			a.checkAge(15);
			
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
