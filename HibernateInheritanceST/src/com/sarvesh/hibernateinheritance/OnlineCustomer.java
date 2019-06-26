package com.sarvesh.hibernateinheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "OnlineCustomer")
//@DiscriminatorValue("onlinecust")

/*
 * @AttributeOverrides({
 * 
 * @AttributeOverride(name="PERSON_ID", column=@Column(name="PERSON_ID")),
 * 
 * @AttributeOverride(name="PERSON_FNAME", column=@Column(name="PERSON_FNAME"))
 * })
 */
public class OnlineCustomer extends Customer {

	@Column(name="EMAIL")
	private String email;
	
	public OnlineCustomer(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public OnlineCustomer(int id, String firstName, String lastName, String email) {
		super(id, firstName, lastName);
		this.email = email;
	}

	public OnlineCustomer() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "OnlineCustomer [email=" + email + "]";
	}

	
	
}
