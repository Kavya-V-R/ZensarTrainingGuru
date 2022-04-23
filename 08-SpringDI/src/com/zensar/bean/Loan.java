package com.zensar.bean;

public class Loan {
String customerName;
Double loanAmount;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Double getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(Double loanAmount) {
	this.loanAmount = loanAmount;
}
public Loan(String customerName, Double loanAmount) {
	super();
	this.customerName = customerName;
	this.loanAmount = loanAmount;
}
public Loan() {
	super();
}
@Override
public String toString() {
	return "Loan [customerName=" + customerName + ", loanAmount=" + loanAmount
			+ "]";
}

}
