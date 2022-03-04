package com.collection.genrics;

public class GenricDemo3<T extends Number> {

	
	public T add(T t) {
		
		return t;
	}
	public static void main(String[] args) {
		
		
		GenricDemo3<Integer> obj = new GenricDemo3<Integer>();
		//GenricDemo3<String> obj1 = new GenricDemo3<String>();
		
		System.out.println(obj.add(101));
		//System.out.println(obj1.add("java"));
		
	}
}
