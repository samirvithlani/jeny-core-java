package com.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();

		map.put("a", "java");
		map.put("b", "c");
		map.put("s", "c++");
		map.put("c", "python");
		map.put("x", "node");
		// map.put(null, "x");
		map.put("x", "mean");

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + "--" + m.getValue());

		}
		Entry<String, String> entry = map.ceilingEntry("a");
		System.out.println("--->" + entry.getKey() + " -" + entry.getValue());

		System.out.println(map.containsKey("s"));
		map.containsValue("mean");

		NavigableSet<String> ns = map.descendingKeySet();
		// ns loop
		System.out.println(map.firstEntry());

	}
}
