package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

//		File file = new File("log1.txt");
//		try {
//			FileWriter w = new FileWriter(file);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		// FileWriter fileWriter = new FileWriter(new File(""));

		try {
			// exist... //it will create...
			FileWriter writer = new FileWriter("log1.txt",true);
			writer.write("\n Hello this is first line in file.....");
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
