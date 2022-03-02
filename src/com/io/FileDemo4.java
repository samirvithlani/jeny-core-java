package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("D:\\workspaces\\java\\Jeny_java\\th.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		

	}
}
