package com.springCore.constructorInjection;

public class Airtel implements Sim {

	private String colour;
	private int cost;

	public void type() {
		System.out.println("Sim type is: "+colour);

	}

	public void cost() {
		System.out.println("Cost of sim is: "+cost+" Rs/-");

	}

	public Airtel(String colour, int cost) {
		super();
		this.colour = colour;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Airtel [colour=" + colour + ", cost=" + cost + "]";
	}

}
