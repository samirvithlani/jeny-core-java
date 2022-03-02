package com.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("python");
		set.add("c");
		set.add("c++");
		// set.add(null);
		set.add("java");

		NavigableSet<String> ns = set.descendingSet();

		System.out.println("dec...");
		for (String s : ns) {

			System.out.println(s);
		}

		System.out.println("sub set...");
		SortedSet<String> ss = set.subSet("c", false, "python", true);

		// System.out.println("polll,."+set.pollFirst());
		// System.out.println("poll"+set.pollLast());

		System.out.println("lower..." + set.lower("python"));
		System.out.println("higher.." + set.higher("python"));

		SortedSet<String> sset = set.tailSet("c");

		System.out.println("TAIL SET..");

		for (String s : sset) {
			System.out.println(s);
		}

		System.out.println("HEAD SET....");

		SortedSet<String> sset1 = set.headSet("python", true);

		for (String s : sset1) {
			System.out.println(s);
		}

	}
}
