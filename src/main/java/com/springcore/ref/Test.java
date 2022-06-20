package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) ac.getBean("refa");
		System.out.println(a.getObj());
	}

}
