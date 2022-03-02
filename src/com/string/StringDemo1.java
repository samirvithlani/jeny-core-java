package com.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// String class ,Data type...
		String s = "java";
		// String str = "java";
		System.out.println(s);
		s.concat("xyz");
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println("upper --> " + s);
		s = s.toLowerCase();
		System.out.println("lower --> " + s);
		char c1 = s.charAt(0);
		System.out.println("char at" + c1);

		System.out.println(s.startsWith("J"));
		System.out.println(s.endsWith("a"));

		// A 65 J = 75
		// a 97 j = 107 32
		System.out.println(s);
		System.out.println(s.compareTo("java"));

		String name = "B";
		System.out.println(name.compareTo("a"));

		System.out.println(s.equals("java"));

		String para = "Mahendra Singh Dhoni, is a former international cricketer who captained the Indian national cricket team in limited-overs formats from 2007 to 2017 and in Test cricket from 2008 to 2014. He is currently the captain of Chennai Super Kings, a franchise based team of Indian Premier League.";

		String word[] = para.split(",");
		System.out.println(word.length);
		for (String s1 : word) {

			System.out.println(s1);
		}

		System.out.println(para.contains("x"));

		String email = "  samir@gmail.com  ";

		System.out.println(email.length());
		System.out.println(email);

		email = email.trim();
		System.out.println(email.length());
		System.out.println(email);

		System.out.println(s.indexOf(97));
		
		
	}
}
