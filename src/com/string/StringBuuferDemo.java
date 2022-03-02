package com.string;

public class StringBuuferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java");
		// concat ->
		sb.append("python");

		System.out.println(sb);

		// sb.reverse();
		System.out.println(sb);

		// sb.delete(0, 1);
		System.out.println(sb);

		sb.setCharAt(0, 'X');
		sb.insert(0, "y");
		System.out.println(sb);

	}
}
