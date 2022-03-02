package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	// Map -->HashMap ->TreeMap
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "c");
		map.put(4, "c++");
		map.put(5, "mean");
		map.put(null, "abc");
		map.put(null, "xyz");
		map.put(5, "mern");
		map.putIfAbsent(5, "jj");
		System.out.println(map.get(3));
		Set<Integer> keys = map.keySet();
		// for loop

		// map.replace(1, "james");
		map.replace(1, "java1", "james");
		// map.remove(1); //key
		map.remove(1, "javaa");
		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + "--" + m.getValue());

		}

		// map.clear();

		//

	}
}
