package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza implements InitializingBean, DisposableBean {
	private String size;
	private float price;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", price=" + price + "]";
	}

	public Pizza(String size, float price) {
		super();
		this.size = size;
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface Destroy");

	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface Init");

	}

}
