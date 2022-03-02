package com.oops;

import java.util.Scanner;

interface RBI {

	float intrate = 7.2f;

	boolean deposit(int amount);

	boolean withdraw(int amount);

}

class SBI implements RBI {

	int amount = 10000;

	@Override
	public boolean deposit(int amount) {

		this.amount = amount + this.amount;

		return true;
	}

	@Override
	public boolean withdraw(int amount) {

		if (this.amount < amount) {

			return false;
		} else {

			this.amount = this.amount - amount;

		}

		return true;
	}

}

public class BankTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		RBI r = new SBI();
		do {
			System.out.println("enter your choice");
			System.out.println("1 for depo");
			System.out.println("2 for witg");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				r.deposit(2000);
				break;

			case 2:
				if (r.withdraw(15000)) {

					System.out.println("with success");
				} else {
					System.out.println("not success");
				}
				break;

			default:
				break;
			}

		} while (choice != 3);

	}

}
