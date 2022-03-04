package com.collection.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(101);
		list.add("jay");
		list.add(false);
		list.add(1234567892l);
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		list.forEach(x->System.out.println(x));
		
		
		
	}
}
