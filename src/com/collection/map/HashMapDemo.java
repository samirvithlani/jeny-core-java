package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Product {

	int pId;
	String pName;
	double pPrice;

	public Product(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

}

public class HashMapDemo {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Iphone", 70500f);
		Product p2 = new Product(2, "Vivo", 45500f);
		Product p3 = new Product(3, "Oppo", 32000f);

		Map<Integer, Product> products = new TreeMap<Integer, Product>();
		products.put(1, p1);
		products.put(2, p2);
		products.put(3, p3);
		products.put(4, new Product(4, "lenovo", 150000f));
		
		
		for(Map.Entry m:products.entrySet()) {
			
			
			//System.out.println(m.getKey()+"-"+m.getValue());
			System.out.println(m.getKey());
			Product p = (Product) m.getValue();
			System.out.println("id = "+p.pId);
			System.out.println("name ="+p.pName);
			System.out.println("price = "+p.pPrice);
			
		}
		
		
		

	}
}
