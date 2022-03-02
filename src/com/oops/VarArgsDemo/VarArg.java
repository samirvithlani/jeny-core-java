package com.oops.VarArgsDemo;

public class VarArg {

	void calc(float f,int... x) {

		System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {

			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) {

		VarArg v = new VarArg();
		v.calc(15f, 12, 45, 78, 98);
	}
}
