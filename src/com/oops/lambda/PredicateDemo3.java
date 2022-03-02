package com.oops.lambda;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void pred(int no,Predicate<Integer> predicate) {
		
		if(predicate.test(no)) {
			
			System.out.println(no);
		}
	}
	public static void main(String[] args) {
		
		pred(100, x-> x>1000);
		
	}
}
