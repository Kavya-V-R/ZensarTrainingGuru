package com.zensar.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.bean.Circle;
import com.zensar.bean.Square;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
	Circle c=(Circle) context.getBean("circleBean");
	//c.setRadius(10);
	System.out.println(c.getArea());
	
	Square square=(Square) context.getBean("squareBean");
//square.setSize(10);
System.out.println(square.computeArea());
}
}
