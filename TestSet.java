package com.cts.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Product> productSet = new HashSet<Product>();
		productSet.add(new Product(1111, "Laptop", 40000));
		productSet.add(new Product(2112, "Laptop", 80000));
		productSet.add(new Product(2112, "Laptop", 46000));
		productSet.add(new Product(2222, "Laptop", 60000));
		productSet.add(new Product(2222, "Laptop", 60000));
		productSet.add(new Product(2222, "Laptop", 60000));
		
		for(Product p : productSet) {
			System.out.println(p);
		}
	}
}
