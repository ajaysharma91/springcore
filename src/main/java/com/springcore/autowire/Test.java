package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");

		Student stu = (Student) ac.getBean("student");
		System.out.println(stu);

	}

}
