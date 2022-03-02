package com.oops.lambda;

import java.util.function.Predicate;

public class PredicateDemo4 {

	
	public static boolean checklen(String name,Predicate<String> pred) {
		
		
		return pred.test(name);
	}
	public static void main(String[] args) {
		
		System.out.println(checklen("jay", x->x.length()>2));
		System.out.println(checklen("amitabj", x->x.contains("b")));
		
	}
}
