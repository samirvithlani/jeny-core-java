package com.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStramDemo {

	
	public static void main(String[] args) {
		
		DataOutputStream out;
		try {
			out = new DataOutputStream(new FileOutputStream("abc2.txt"));
			out.writeInt(65);
			out.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
