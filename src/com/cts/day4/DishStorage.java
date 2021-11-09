package com.cts.day4;

import java.util.ArrayList;
import java.util.List;

public class DishStorage {
	public static List<Dish> getDish() {
		List<Dish> d = new ArrayList<Dish>();
		d.add(new Dish("Burger","Non Veg", 140.00, 4));
		d.add(new Dish("Burger","Veg", 80.00, 3));
		d.add(new Dish("Pizza","Non Veg", 400.00, 5));
		d.add(new Dish("Pizza","Veg", 200.00, 4));
		d.add(new Dish("Kebab","Veg", 100.00, 3));
		d.add(new Dish("Kebab","Non Veg", 200.00, 5));
		d.add(new Dish("Fried Rice","Veg", 150.00, 2));
		d.add(new Dish("Fried Rice","Non Veg", 200.00, 3));
		
		return d;
		
		
	}
}