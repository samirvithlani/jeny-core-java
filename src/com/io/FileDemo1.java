package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("pls enter your choice :::");
			System.out.println("Press 1 for create new FIle ::: ");
			System.out.println("Press 2 for create new Folder ::: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.println("pls enter file name to create....");
				String fname = sc.next();
				fname = fname.concat(".txt");
				File file = new File(fname);
				try {
					if (file.createNewFile()) {

						System.out.println("file created....");
					} else {

						System.out.println("file not created....");
					}
				} catch (IOException e) {

					e.printStackTrace();
				}

				break;

			case 2:

				System.out.println("pls enter folder name to create....");
				String foname = sc.next();
				File file2 = new File(foname);
				if (file2.mkdir()) {
					System.out.println("folder created....");
				} else {

					System.out.println("folder not created...");
				}

				break;

			case 3:

				System.out.println("pls enter file name to create....");
				String fname1 = sc.next();
				fname = fname1.concat(".txt");
				File file3 = new File("demo/" + fname1);
				try {
					if (file3.createNewFile()) {

						System.out.println("file created....");
					} else {

						System.out.println("file not created....");
					}
				} catch (IOException e) {

					e.printStackTrace();
				}

				break;

			case 4:

				System.out.println("enter file name to delete....");
				String dname = sc.next();
				File file4 = new File(dname);
				if (file4.delete()) {
					System.out.println("File " + dname + " deleted");
				} else {

					System.out.println("file not deleted..");
				}

				break;

			case 5:

				System.out.println("enter file / foldet name to check exist or not...");
				String check = sc.next();
				File file5 = new File(check);
				if (file5.exists()) {

					System.out.println("file / folder exist,,,");
				} else {

					System.out.println("file / folder not exist...");
				}

				break;

			case 6:

				break;

			default:
				break;
			}

		} while (choice != 7);

	}

}
