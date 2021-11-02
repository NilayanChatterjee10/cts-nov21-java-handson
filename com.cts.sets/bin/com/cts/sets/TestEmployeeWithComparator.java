package com.cts.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployeeWithComparator {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "Alex", 52000));
		list.add(new Employee(1, "Charles", 42000));
		list.add(new Employee(4, "David", 32000));
		list.add(new Employee(2, "Bruce", 22000));
		printEmployees(list);
		// You implement Comparator in an anonymous class
		Comparator<Employee> compareIdInAsc =  new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e1.getId(), e2.getId());
			}
		};
		Collections.sort(list, compareIdInAsc); // it calls compare() method Comparator
		printEmployees(list);
		Comparator<Employee> compareIdInDesc = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return Integer.compare(e2.getId(), e1.getId());
			}
		};
		Collections.sort(list, compareIdInDesc);
		printEmployees(list);
		Comparator<Employee> compareSalaryInAsc =  new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e1.getSalary(), e2.getSalary());
			}
		};
		Collections.sort(list, compareSalaryInAsc); // it calls compare() method Comparator
		printEmployees(list);
		Comparator<Employee> compareSalaryInDesc = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return Double.compare(e2.getSalary(), e1.getSalary());
			}
		};
		Collections.sort(list, compareSalaryInDesc);
		printEmployees(list);
		Comparator<Employee> compareNameInAsc =  new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo( e2.getName());
			}
		};
		Collections.sort(list, compareNameInAsc); // it calls compare() method Comparator
		printEmployees(list);
		Comparator<Employee> compareNameInDesc = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return (e2.getName()).compareTo( e1.getName());
			}
		};
		Collections.sort(list, compareNameInDesc);
		printEmployees(list);
	
	}
	public static void printEmployees(List<Employee> list) {
		for(Employee e : list) {
			System.out.println(e);
		}
		System.out.println("--------------------");
	}

}