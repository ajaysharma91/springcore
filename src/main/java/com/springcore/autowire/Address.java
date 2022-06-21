package com.springcore.autowire;

public class Address {
	private String street;
	private String post;

	@Override
	public String toString() {
		return "Address [street=" + street + ", post=" + post + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String post) {
		super();
		this.street = street;
		this.post = post;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
}
