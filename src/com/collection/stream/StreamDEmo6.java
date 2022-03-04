package com.collection.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDEmo6 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(101);
		list.add(111);
		list.add(1);
		list.add(1100);
		list.add(250);
		list.add(100);
		list.add(785);
		list.add(456);

		//Integer a[] = list.stream().toArray(Integer[]::new);
		Integer a[] = list.stream().filter(x -> x % 2 == 0 && x % 5 == 0).toArray(Integer[]::new);
		LinkedList<Integer> p = list.stream().collect(Collectors.toCollection(LinkedList::new));
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		HashSet<Integer> hashSet  =list.stream().collect(Collectors.toCollection(HashSet::new));
		

	}
}
