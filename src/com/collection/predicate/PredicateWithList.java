package com.collection.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User {

	String name, role;

	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}

}

public class PredicateWithList {

	public static List<User> filter(List<User> users, Predicate<User> predicate) {

		List<User> res = new ArrayList<User>();
		for (User u : users) {

			if (predicate.test(u)) {

				res.add(u);
			}
		}

		return res;
	}

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		users.add(new User("jay", "manager"));
		users.add(new User("raj", "manager"));
		users.add(new User("parth", "developer"));
		
		
		List<User> filterData = filter(users, (User u)->u.role.equals("manager"));
		List<User> filterData1 = filter(users, (User u)->u.role.equals("dev"));
		for(User u:filterData1) {
			
			System.out.println(u.name);
		}
		

	}
}
