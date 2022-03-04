package com.collection.genrics;

public class GenricDemo2<T,S> {
	
	public void add(T t,S t1) {
		
		
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		
		//GenricDemo2<Integer> obbj = new GenricDemo2<Integer>();
		GenricDemo2<Integer, String> x = new GenricDemo2<Integer, String>();
		x.add(101, "jayt");
	}
}
