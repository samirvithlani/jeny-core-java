package com.collection.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

//	boolean flag;
//	if(age>18) {
//		t
//	}
//	else {
//		
//		f
//	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> salpredicate = x ->(x<50000);
		
		System.out.println(salpredicate.test(15000));
		
		
	}
}
