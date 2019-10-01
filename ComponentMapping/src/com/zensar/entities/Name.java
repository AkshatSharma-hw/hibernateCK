package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Chetna Khapre
 * @version 1.1
 *@creation_date 26/09/2019
 */

@Embeddable

public class Name {
	@Column(name="first", length=30)
	private String firstName;
	
	private String lastName;
	
	@Column(name="middle")
	private String middleName;
	
	public Name() {
		// TODO Auto-generated constructor stub
	}

	public Name(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
	
}
