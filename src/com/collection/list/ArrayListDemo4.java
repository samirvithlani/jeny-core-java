package com.collection.list;

import java.util.ArrayList;
import java.util.List;

class Student {

	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class ArrayListDemo4 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student(101, "Abc");
		Student s2 = new Student(102, "xyz");
		Student s3 = new Student(103, "pqr");

		students.add(s1);
		students.add(s2);
		students.add(s3);

		for (Student s : students) {

			System.out.println(s);
			System.out.println(s.id + "--" + s.name);
		}

	}
}
