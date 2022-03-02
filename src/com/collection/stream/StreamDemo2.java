package com.collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<Integer> salary = new ArrayList<Integer>();
		salary.add(1500);
		salary.add(100);
		salary.add(1800);
		salary.add(11500);
		salary.add(200);
		salary.add(50);

		Stream<Integer> s = salary.stream();
		// s.filter(x-> x>1500).forEach(x->System.out.println(x));
		s.filter(x -> x > 1500).map(x -> x * 10).forEach(x -> System.out.println(x));

	}
}
