package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Demo{
	
	
	public void ex() throws ClassNotFoundException {
		
		System.out.println("");
	}
}

public class RuntimeExceptionDemo {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//pre define class's method int that method thay throes exception
		
		Demo d = new Demo();
		d.ex();
		
		
		try {
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
