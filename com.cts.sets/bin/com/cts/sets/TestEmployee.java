package com.cts.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "Alex", 52000));
		list.add(new Employee(1, "Charles", 42000));
		list.add(new Employee(4, "David", 32000));
		list.add(new Employee(2, "Bruce", 22000));
		printEmployees(list);
		// to sort list we have Collections.sort(list)
		Collections.sort(list); // sort method calls compareTo method of Employee internally
		printEmployees(list);
	}
	public static void printEmployees(List<Employee> list) {
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println("--------------------");
	}
}