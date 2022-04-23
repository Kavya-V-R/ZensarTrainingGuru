package com.zensar.ui;

import com.zensar.bean.Circle;
import com.zensar.bean.Square;


public class Main {
public static void main(String[] args) {

	Circle c=new Circle();
	c.setRadius(10);
	System.out.println(c.getArea());
	
	Square square = new Square(); 
	square.setSize(10);
	System.out.println(square.computeArea());
}
}
