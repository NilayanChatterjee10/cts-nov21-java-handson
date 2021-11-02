package com.cts.sets;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// compare to method must return in value based on comparing 2 objects, -1, 0, 1 tells which is greater/lesser/neutral
	@Override
	public int compareTo(Employee o) {
		return Double.compare(this.salary, o.getSalary()); // 2 employees are compared 
		//return this.name.compareTo(o.getName());
	}
}