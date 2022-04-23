package com.zensar.bean;

public class Circle implements Shape{
int radius;
public double calculateArea(){
	return this.radius*this.radius*3.14;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

@Override
public void setSize(int size) {
	// TODO Auto-generated method stub
	
}
@Override
public double getArea() {
	return this.calculateArea();
}
}
