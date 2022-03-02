package com.io;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291\\bin");

		String files[] = file.list();

		for (String s : files) {

			System.out.println(s);
		}

		File f[] = file.listFiles();
		for (File ff : f) {

			System.out.println(ff);
		}
	}
}
