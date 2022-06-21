package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vegi {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vegi(String name) {
		super();
		this.name = name;
	}

	public Vegi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vegi [name=" + name + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Annotation Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Annotation Init");
	}
}
