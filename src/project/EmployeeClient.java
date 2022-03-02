package project;

import java.util.Scanner;

class Employee {

	int eId;
	String eName;

	public Employee(int eId, String eName) {

		this.eId = eId;
		this.eName = eName;
	}

	public Employee() {

	}

}

public class EmployeeClient {

	public void getEmployeeData() {

		Employee[] emp = new Employee[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("PLS ENTER EMPLOYEE DATA:");
		for (int i = 0; i < emp.length; i++) {

			System.out.println("pls enter Employee ID:");
			int id = sc.nextInt();
			System.out.println("pls enter Employee NAME:");
			String name = sc.next();

			Employee e1 = new Employee(id, name);
			emp[i] = e1;

		}
		printEmployeeData(emp);

	}

	public void printEmployeeData(Employee[] emp) {

		System.out.println("EMPLOYEE DATA::::");
		for (int i = 0; i < emp.length; i++) {

			System.out.println("EMPLOYEE ID = " + emp[i].eId + " EMPLOYEE NAME = " + emp[i].eName);
		}

	}

	public static void main(String[] args) {

		EmployeeClient employee = new EmployeeClient();
		employee.getEmployeeData();
		// employee.printEmployeeData();

	}
}
