package com.cts.day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByDesig {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(
				new Employee("Alex", "Clerk"),
				new Employee("Bruce", "Manager"),
				new Employee("Charles", "Officer"),
				new Employee("David", "Officer"),
				new Employee("Edward", "Clerk"),
				new Employee("Frank", "Clerk")
				);
		// grouping users belonging to same city in key value pairs
		// key is city value is Set<String>
		Map<String, Set<String>> map = emp.stream()
		.collect(Collectors.groupingBy(u -> u.getDesig(), 
				Collectors.mapping(u->u.getName(), Collectors.toSet())));
		System.out.println(map);
	}


}
