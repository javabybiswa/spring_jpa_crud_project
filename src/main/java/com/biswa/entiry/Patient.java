package com.biswa.entiry;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Patient {
	
	@Id
	@Column
	private String emailId;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String gender;
	
	@Column
	private String contact;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Patient(String name, int age, String gender, String contact, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", contact=" + contact + ", emailId="
				+ emailId + "]";
	}

}