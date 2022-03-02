package com;

import com.oops.OuterInterface;

public class ImplClass implements OuterInterface.InnerInterface {

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		OuterInterface.InnerInterface i = new ImplClass();
		i.demo();
	}

}
