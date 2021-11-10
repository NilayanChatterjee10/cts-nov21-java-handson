package com.cts.day5;

public class Employee {

	private String name;
	private String desig;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee(String name, String desig) {
		super();
		this.name = name;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desig=" + desig + "]";
	}
	
}
