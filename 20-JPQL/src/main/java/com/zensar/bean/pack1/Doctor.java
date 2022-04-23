package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "doctors10")

@NamedQueries({ @NamedQuery(name = "findAll", query = "select d from Doctor d"),
		@NamedQuery(name = "findById", query = "select d from Doctor d where d.id=:did"),
@NamedQuery(name = "findByfeesRange", query = "select d from Doctor d where fees between :start and :end ")
})

@NamedNativeQueries({ @NamedNativeQuery(name = "readAll", query = "select*from doctors10", resultClass = Doctor.class),
		@NamedNativeQuery(name = "readById", query = "select*from doctors10 where id=?", resultClass = Doctor.class) })

public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Name;
	double fees;
	String gender;
	LocalDate practicingSince;
	
	public Doctor() {
		super();
	}

	public Doctor(String name, double fees, String gender, LocalDate practicingSince) {
		super();
		Name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}

	public Doctor(int id, String name, double fees, String gender, LocalDate practicingSince) {
		super();
		this.id = id;
		Name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getPracticingSince() {
		return practicingSince;
	}

	public void setPracticingSince(LocalDate practicingSince) {
		this.practicingSince = practicingSince;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", Name=" + Name + ", fees=" + fees + ", gender=" + gender + ", practicingSince="
				+ practicingSince + "]";
	}
	
	
	
}
