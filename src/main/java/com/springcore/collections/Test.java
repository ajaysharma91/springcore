package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
		Employee emp = (Employee) ap.getBean("employee");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());

	}

}
