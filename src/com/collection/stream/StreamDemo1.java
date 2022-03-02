package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("jay");
		names.add("raj");
		names.add("parth");
		names.add("amit");
		names.add("ashish");
		names.add("akshit");
		names.add("ajay");
		names.add("dhruvi");
		
//		for(String s:names) {
//			
//			if(s.s) {
//				l.add(s)
//			}
////			System.out.println(s);
//		}
		
		//names.stream().sorted().forEach(s->System.out.println(s));
		names.stream().filter(s->s.startsWith("a")).sorted().map(x->x.concat("X")).forEach(x->System.out.println(x));
		//List<String> list = names.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		//list.stream().forEach(x->System.out.println(x));
		
		
	}
}
