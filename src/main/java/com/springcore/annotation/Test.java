package com.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaSconfig.class);
		Student s = ac.getBean("students", Student.class);
		System.out.println(s);
		s.study();
	}
}
