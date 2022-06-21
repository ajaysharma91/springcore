package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lconfig.xml");
//		Pizza p = (Pizza) ac.getBean("pizza");
		Vegi p = (Vegi) ac.getBean("vegi");
		System.out.println(p);
		ac.registerShutdownHook();

	}

}
