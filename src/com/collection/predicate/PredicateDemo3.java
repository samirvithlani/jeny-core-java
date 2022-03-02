package com.collection.predicate;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {

		Predicate<String> p = new Predicate<String>() {

			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.contains("a");
			}

		};
		System.out.println(p.test("mit"));
	}
	
	
	
	
}
