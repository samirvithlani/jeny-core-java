package com.io.serl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	int id;
	String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "jay");

		// serlize
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			out.writeObject(emp);
			out.close();
			System.out.println("data serlized...");
			
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.ser"));
			Employee e = (Employee)in.readObject();
			System.out.println(e.id);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
