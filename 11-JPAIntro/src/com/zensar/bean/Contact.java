package com.zensar.bean;

import javax.persistence.*;

@Entity
@Table(name="Contacts")

public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_email")
	private String email;
	
	@Column(name="c_phone")
	private String phone;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + "]";
	}

}
