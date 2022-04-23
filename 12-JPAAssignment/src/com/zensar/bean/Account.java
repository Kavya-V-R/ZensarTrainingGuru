package com.zensar.bean;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int accountId;
	
	@Column(name="c_name")
	String name;
	
	@Column(name="c_balance")
	double balance;
	
	@Column(name="c_doj")
	LocalDate dateOfOpening;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name
				+ ", balance=" + balance + ", dateOfOpening=" + dateOfOpening
				+ "]";
	}
}
