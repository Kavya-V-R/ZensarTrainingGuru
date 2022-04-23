package com.zensar.bean.pack1;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	private int empId;

	@Column
	private String name;

	@Column
	private double salary;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;

	public Employee(int empId, String name, double salary, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
