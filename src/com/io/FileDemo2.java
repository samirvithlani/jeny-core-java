package com.io;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {

		File file = new File("th.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());

	}
}
