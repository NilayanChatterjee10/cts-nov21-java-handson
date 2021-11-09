package com.cts.day4;

public class Dish {

	private String name;
	private String type;
	private double price;
	private int ratings;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public Dish(String name, String type, double price, int ratings) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Dish [name=" + name + ", type=" + type + ", price=" + price + ", ratings=" + ratings + "]";
	}
	
}
