package com.collection.stream;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class StreamDemo4 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "iphone", 1250.60));
		products.add(new Product(103, "lenovo", 450));
		products.add(new Product(102, "oppo", 250.75));

//		for(Product p :products) {
//			
//			System.out.println(p.id);
//		}

		products.stream().filter(x->x.name.startsWith("o")).forEach(x -> System.out.println(x.id + "-" + x.name + "-" + x.price));

	}
}
