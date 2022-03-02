package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo5 {

	
	public static void main(String[] args) {
		
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("abc.txt");
			fileWriter.write(65);
			fileWriter.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
