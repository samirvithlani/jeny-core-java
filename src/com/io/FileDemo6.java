package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileDemo6 {

	
	public static void main(String[] args) {
		
		
		try {
			PrintWriter out = new PrintWriter(new File("int.txt"));
			out.write(new Integer(100).toString());
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
