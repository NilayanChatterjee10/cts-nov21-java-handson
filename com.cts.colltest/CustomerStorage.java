package com.cts.colltest;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {
	
		List<Customer> clist =new ArrayList<>();
		
		public void store(Customer c) {
			clist.add(c);
		}
	public Customer getCustomer(int id) throws CustomerNotFoundException {
		Account a;
		int b=0;
		for(Customer c:clist) {
			if(c.getcID()==id) {
				a=c.getAcc();
				System.out.println("Name-"+c.getName()+" Account Number "+a.getAccno()+" Amount "+a.getAmount());
			b=1;
			return c;
			} 
				
			
		} if(b==0)
			throw new CustomerNotFoundException("Sorry, no user found with ID-"+id+".");
		 return null;
		 
	}
	public List<Customer>getAllCust(){
		return clist;
	}
	

}
