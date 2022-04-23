package com.zensar.bean.employee;

public class Employee {
private int id;
private String name;
private double basicSalary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", basicSalary="
			+ basicSalary + "]";
}


}
