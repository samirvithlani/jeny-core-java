package com.collection.set;

import java.util.TreeSet;

class Employee {

	int eId;
	String eName;

	public Employee(int eId, String eName) {

		this.eId = eId;
		this.eName = eName;
	}

}

public class TreeSetdemo3 {

	public static void main(String[] args) {

		
		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee(101, "jay"));
		emp.add(new Employee(102, "raj"));
		
		
	}
}
