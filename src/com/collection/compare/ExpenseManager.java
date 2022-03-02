package com.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Expense implements Comparable<Expense>{
	
	int eId;
	String eName;
	double eAmount;
	
	
	
	public Expense(int eId, String eName, double eAmount) {
		
		this.eId = eId;
		this.eName = eName;
		this.eAmount = eAmount;
	}
//	@Override
//	public int compareTo(Expense o) {
//	
//		
//		return eName.compareTo(o.eName);
//	}
	
	@Override
	public int compareTo(Expense o) {
		
		if(eAmount>o.eAmount) {
			
			return 1;
		}
		else if(eAmount == o.eAmount)
			return 0;
		
		return -1;
	}
	
	
	
	
	
	
	
}
public class ExpenseManager {

	
	public static void main(String[] args) {
		
		
		ArrayList<Expense> expenses = new ArrayList<Expense>();
		Expense e3 = new Expense(10, "groc", 2200d);
		Expense e1 = new Expense(101, "milk", 150d);
		Expense e2 = new Expense(102, "fashion", 500d);
		
		
		expenses.add(e1);
		expenses.add(e2);
		expenses.add(e3);
		
		
		
		Collections.sort(expenses);
		
		for(Expense e:expenses) {
			
			System.out.println(e.eId + "-"+e.eName+" - "+e.eAmount);
		}
		
		
		
		
	}
	
}
