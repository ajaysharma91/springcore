package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
