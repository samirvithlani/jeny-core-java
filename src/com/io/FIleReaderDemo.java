package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderDemo {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			System.out.println((char) reader.read());
			// read return char '\0'
			// read return String null
			// read int 0 1 2 3 45 n -1
			int c;
			int count = 0;
			while ((c = reader.read()) != -1) {

				System.out.print((char) c);
				count++;
			}

			System.out.println(count);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
