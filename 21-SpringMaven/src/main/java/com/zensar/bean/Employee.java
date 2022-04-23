package com.zensar.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id = 101;
	String name = "Arun";

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
