package com.cts.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambdaExpressionWithComparator {

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User(200, "Zaheer",10000));
		users.add(new User(100, "Yuvraj",5000));
		users.add(new User(400, "Bruce",80000));
		users.add(new User(300, "Alex",8000));
		printUsers(users);

		Collections.sort(users, (u1, u2) -> Integer.compare(u2.getUserId(), u1.getUserId()));
		printUsers(users);
		Collections.sort(users, (u1, u2) -> Integer.compare(u1.getUserId(), u2.getUserId()));
		printUsers(users);
		Collections.sort(users, (u1, u2) ->u1.getName().compareTo(u2.getName()));
		printUsers(users);
		Collections.sort(users, (u1, u2) ->u2.getName().compareTo(u1.getName()));
		printUsers(users);
		Collections.sort(users, (u1, u2) -> Integer.compare(u2.getSalary(), u1.getSalary()));
		printUsers(users);
		Collections.sort(users, (u1, u2) -> Integer.compare(u1.getSalary(), u2.getSalary()));
		printUsers(users);
	}
	public static void printUsers(List<User> list) {
		for(User u : list) {
			System.out.println(u);
		}
		System.out.println("-----------------------");
	}

}