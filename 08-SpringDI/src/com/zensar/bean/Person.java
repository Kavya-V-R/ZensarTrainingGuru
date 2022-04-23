package com.zensar.bean;

public class Person {
String name;
Address address;
double basic;
SalaryCalculator bgradeBean;


@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}

public double getAllowance(){
	double allowanceAmt=this.bgradeBean.computeAllowance(basic);
	return allowanceAmt;
	
}
public SalaryCalculator getBgradeBean() {
	return bgradeBean;
}
public void setBgradeBean(SalaryCalculator bgradeBean) {
	this.bgradeBean = bgradeBean;
}

}
