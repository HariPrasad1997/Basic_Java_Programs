package com.harsha.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		// Traditional approach
		List<Product> list = getAllProducts();
//		for (Product product : getAllProducts()) {
//			if (product.getPrice() < 25000) {
//				list.add(product);
//			}
//		}
//
//		for (Product product : list) {
//			System.out.println(product);
//		}

		// Using stream API
		list.stream().filter(price -> price.getPrice() > 25000).collect(Collectors.toList())
				.forEach(System.out::println);

	}

	private static List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Laptop", 35000.56f));
		products.add(new Product(2, "Mobile", 25000.26f));
		products.add(new Product(3, "House", 3500000.76f));
		products.add(new Product(4, "Bag", 1000.86f));
		products.add(new Product(5, "Clothes", 3500.126f));
		return products;
	}

}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
