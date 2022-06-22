package com.springcore.annotation;

import org.springframework.stereotype.Component;

@Component("students")
public class Student {
	public void study() {
		System.out.println("Studynig ");
	}
}
