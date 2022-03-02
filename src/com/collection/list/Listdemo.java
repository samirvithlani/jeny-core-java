package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {

		// type safty..
		List<String> names = new ArrayList<String>();

		// index --> Dynamic Array --->
		names.add("raj");
		names.add("jay");
		names.add("parth");
		names.add("ajay");
		names.add("nik");
		names.add("ajay");
		names.add(0, "abhay");

		System.out.println(names.get(0));
		System.out.println(names.size());

//		for (int i = 0; i < names.size(); i++) {
//
//			System.out.println(names.get(i));
//		}

		for (String s : names) {

			System.out.println(s);
		}
//		names.clear();
//		for (String s : names) {
//
//			System.out.println(s);
//		}

		List<String> slist = names.subList(0, 3);

		for (String s : slist) {

			System.out.println(s);
		}

		System.out.println("--------------------");

		names.set(0, "Akshay");

		for (String s : names) {

			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		//names.remove(0);
		System.out.println(names.remove("akshay"));
		System.out.println("after reovinf=g 0 th index");
		for (String s : names) {

			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		System.out.println(names.indexOf("ajay"));
		System.out.println(names.lastIndexOf("ajay"));
		System.out.println(names.contains("nik"));
		System.out.println(names.isEmpty());
		System.out.println(names.equals(slist));
		
		System.out.println(names.toArray());
		System.out.println(names.toString());
		
		
		
		
		
		

	}

}
