package com.springcore.lifecycle;

public class Pasty {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Set Price");
		this.price = price;
	}

	public Pasty(int price) {
		super();
		this.price = price;
	}

	public Pasty() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pasty [price=" + price + "]";
	}

	public void init() {
		System.out.println("Init Method Called");
	}

	public void destroy() {
		System.out.println("Destroy called");
	}

}
