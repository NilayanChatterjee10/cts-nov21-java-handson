package com.cts.colltest;

import java.util.*;

public class CollecDemo {

	public static void main(String[] args) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		CustomerStorage cst=new CustomerStorage();
	int d=100;
		Scanner sc= new Scanner(System.in);
		while(true) {
			
			System.out.println("1. Add Customer, 2. Find by ID, 3. Get All Customers, 4. Exit.");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter Name");
				String n=sc.next();
				System.out.println("Enter Account Number");
				int an=sc.nextInt();
				System.out.println("Enter Amount");
				int a=sc.nextInt();
				
				Account acc=new Account(an,a);
				Customer c= new Customer(n,d,acc);
				System.out.println("Your ID is - "+d);
				d++;
				cst.store(c); break;}
			case 2:{
				System.out.println("Enter ID");
				int id=sc.nextInt();
					cst.getCustomer(id);
				break;
				
			}
			case 3:{
			cst.getAllCust();
			break;
			}
			case 4:{
				System.out.println("Thank you for visiting.");
				System.exit(0);
			}
			default:{
				System.out.println("Invalid Input");
			}
		}
		}
		
		}
	}

	


