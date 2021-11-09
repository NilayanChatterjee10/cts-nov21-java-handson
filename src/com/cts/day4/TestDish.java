package com.cts.day4;

import java.util.List;

import java.util.stream.Collectors;


public class TestDish {
	public static void main(String[] args) {
		List<Dish> list = DishStorage.getDish();
		System.out.println("1. Veg Dishes");//1
		list.stream().filter(l -> l.getType().equals("Veg")).forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------");
		System.out.println("2. Non Veg Dishes");//2
		list.stream().filter(l -> l.getType().equals("Non Veg")).forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------");
		System.out.println("3. Veg Dishes Sorted");//3
		list.stream().filter(l -> l.getType().equals("Veg")).sorted((l1, l2) -> Double.compare(l1.getPrice(),l2.getPrice())).forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------");
		
		System.out.println("4. Sorted based on Ratings");//4
		list.stream().sorted((l1, l2) -> Integer.compare(l2.getRatings(),l1.getRatings())).forEach(l -> System.out.println(l));
		System.out.println("----------------------------------------");
		System.out.println("5. +4 Ratings");//5
		List<Dish> sd = list
				.stream()
				.filter(dish -> dish.getRatings() >=4)
				.collect(Collectors.toList());
		sd.forEach(item -> System.out.println(item));
		System.out.println("----------------------------------------");
		System.out.println("6. Only Veg Dishes");//6
		long c=list.stream().filter(l -> l.getType().equals("Non Veg")).count();
		System.out.println("There are only "+c+" Veg dishes in our menu.");
		System.out.println("----------------------------------------");
	}
}
