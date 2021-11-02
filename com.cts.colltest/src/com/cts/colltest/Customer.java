package com.cts.colltest;

public class Customer{
	private String name;
	private int cID;
	Account acc;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getcID() {
		return cID;
	}



	public void setcID(int cID) {
		this.cID = cID;
	}



	public Account getAcc() {
		return acc;
	}



	public void setAcc(Account acc) {
		this.acc = acc;
	}



	public Customer(String name, int cID, Account acc) {
		
		this.name = name;
		this.cID = cID;
		this.acc = acc;
	}
	

}
