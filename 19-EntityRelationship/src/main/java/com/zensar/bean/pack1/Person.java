package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "persons30")
public class Person {

	@Id
	int personId;
	String personName;
	LocalDate dateOfBirth;
	char gender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "persons30_contactInfo30", 
	joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "personId"), 
	inverseJoinColumns = @JoinColumn(name = "contact_id", referencedColumnName = "contactId",
	unique = true))
	
	ContactInfo contactinfo;

	public Person() {
		super();
	}

	public Person(String personName, LocalDate dateOfBirth, char gender, ContactInfo contactinfo) {
		super();
		this.personName = personName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactinfo = contactinfo;
	}

	public Person(int personId, String personName, LocalDate dateOfBirth, char gender, ContactInfo contactinfo) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactinfo = contactinfo;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public ContactInfo getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(ContactInfo contactinfo) {
		this.contactinfo = contactinfo;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", contactinfo=" + contactinfo + "]";
	}

}
