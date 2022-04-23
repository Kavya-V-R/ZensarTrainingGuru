package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext;
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println(applicationContext.getBean("employee"));
		System.out.println(applicationContext.getBean("student"));

	}
}
