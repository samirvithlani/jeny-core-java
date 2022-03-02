package com.oops.lambda;

import java.util.function.Predicate;

public class PredicateDemo2 {

	
	public static void main(String[] args) {
		
		Predicate<Integer> less  = x->(x<20);
		Predicate<Integer> gret  = x->(x>10);
		
		System.out.println(less.or(gret).test(21));
	}
}
