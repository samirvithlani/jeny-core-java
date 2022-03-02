package com.collection.map;

import java.util.Map;
import java.util.TreeMap;

class Hr {

	int id;
	String name;

	public Hr(int id, String name) {

		this.id = id;
		this.name = name;
	}

}
//1 -> 
//Employee id --> name,email

public class TreeDemo {

	public static void main(String[] args) {

		Map<Hr, String> map = new TreeMap<Hr, String>();
		map.put(new Hr(1, "Raj"), "1");

	}
}
