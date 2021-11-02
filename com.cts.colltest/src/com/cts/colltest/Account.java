package com.cts.colltest;

public class Account {
	private int accno;
	private double amount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account(int accno, double amount) {
		
		this.accno = accno;
		this.amount = amount;
	}
	

}
