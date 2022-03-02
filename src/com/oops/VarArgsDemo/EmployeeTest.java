package com.oops.VarArgsDemo;

class Employee {

	int eId;
	String eName;

	Employee(int eId, String eName) {

		this.eId = eId;
		this.eName = eName;
	}

	Employee() {
		// TODO Auto-generated constructor stub
	}

}

public class EmployeeTest {

	public static void main(String[] args) {

		int a[] = new int[2];
		a[0] = 100;

		// class ---> object
		//array
		Employee[] e = new Employee[2];

		Employee e1 = new Employee(1, "jay");
		e[0] = e1;
		e[1] = new Employee(2, "raj");

		for (int i = 0; i < e.length; i++) {

			System.out.println(e[i].eId + " -- " + e[i].eName);

		}

	}

}
