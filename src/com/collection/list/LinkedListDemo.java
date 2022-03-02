package com.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.offer("php");
		list.add("java");
		list.add(0, "c++");
		list.addFirst("c");
		list.addLast("python");
		list.offerFirst("AI");
		list.offerLast("ML");
		list.isEmpty();
		
		for (String s : list) {
			System.out.println(s);
		}
		
		
		//list.clear();
		//System.out.println(list.contains("java"));
		
		
		System.out.println("element..."+list.element());
		System.out.println("peek...."+list.peek());
		
		System.out.println("poll..."+list.poll());
		System.out.println("remove...."+list.remove());
				
		for (String s : list) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
