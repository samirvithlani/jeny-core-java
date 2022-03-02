package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		List<String> class1 = new ArrayList<String>();

		class1.add("a");
		class1.add("b");
		class1.add("c");

		List<String> class2 = new ArrayList<String>();
		class2.add("x");
		class2.add("y");
		class2.add("z");

		List<String> sch = new ArrayList<String>();
		sch.addAll(class1);
		sch.addAll(class2);

		for (String s : sch) {

			System.out.println(s);
		}

	}
}
