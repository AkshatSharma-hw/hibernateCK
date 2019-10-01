package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Chetna Khapre
 * @version 1.1
 * @creation_date 26/09/2019
 */

@Entity
@Table(name = "Customer")
public class Customer {
	@Id 
	@Column(name = "customerId")
	
	
	private int customerId;
	private Name customerName;
	private String gender;
	private int age;
	private String address;
	private LocalDate dob;
	private Blob profilePhoto;
	
	private Clob description;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, Name customerName, String gender, int age) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Name getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	
	public Blob getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(Blob profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	
	

	public Clob getDescription() {
		return description;
	}

	public void setDescription(Clob description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", age="
				+ age + "]";
	}
	
	
}
