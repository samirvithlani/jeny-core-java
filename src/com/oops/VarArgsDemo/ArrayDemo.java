package com.oops.VarArgsDemo;

import java.util.Scanner;

public class ArrayDemo {

	// index,0

	public static void main(String[] args) {
		// int a[] = new int[] {10,20,30,40,50};
		int a[] = new int[15];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("enter value " + i);
			a[i] = sc.nextInt();
		}

		// for each loop

//		for(int x:a) {
//			
//			System.out.println(x);
//		}
		
		// for loop
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
