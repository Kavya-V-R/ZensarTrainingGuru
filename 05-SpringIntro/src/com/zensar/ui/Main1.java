package com.zensar.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.bean.Shape;

public class Main1 {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
Shape shape=(Shape) context.getBean("shapeBean");
//shape.setSize(50);
System.out.println(shape.getArea());
}
}
