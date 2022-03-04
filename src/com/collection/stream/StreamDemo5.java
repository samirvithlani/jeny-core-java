package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("ajay");
		list.add("raj");
		list.add("parth");
		list.add("jay");
		
		
		System.out.println(list.stream().noneMatch(x->x.startsWith("bomb")));
		System.out.println(list.stream().filter(x->x.startsWith("a")).count());
		
		List<String> alist = list.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
	}
}
