package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			BufferedReader br = new BufferedReader(reader);

			System.out.println(br.readLine());
			String data;
			int count =0;
			while ((data = br.readLine()) != null) {

				System.out.println(data);
				count++;
			}

			System.out.println(count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
