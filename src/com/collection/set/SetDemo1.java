package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {

		// assending oreder....
		Set<String> set = new TreeSet<String>();

		set.add("java");
		set.add("python");
		set.add("c");
		set.add("c++");
		// set.add(null);
		set.add("java");

		set.remove("c++");

		for (String s : set) {

			System.out.println(s);
		}

	}
}
