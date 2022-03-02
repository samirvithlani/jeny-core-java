package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String s = "java by james";
		String str = s.substring(0, 3);
		System.out.println(str);
		
		//s.substring(2);v to s
		System.out.println(s.indexOf("j",4));
		System.out.println(s.endsWith("s"));
		s.startsWith("s");
		
		System.out.println(s.lastIndexOf("j"));
		byte  b[] = s.getBytes();
		System.out.println(b.length);
		
		s = s.replace('j', 'X');
		System.out.println(s);
		s = s.replace("Xa", "ja");
		System.out.println(s);
	}
}
