package com.sarvesh.hibernateinheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
//@Table(name = "Customer")
//@DiscriminatorValue("cust")

/*
 * @AttributeOverrides({
 * 
 * @AttributeOverride(name="PERSON_ID", column=@Column(name="PERSON_ID")),
 * 
 * @AttributeOverride(name="PERSON_FNAME", column=@Column(name="PERSON_FNAME"))
 * })
 */
public class Customer extends Person{
	
	@Column(name="MOBILE_NO")
	private String mobileNo;
	
	public Customer(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [mobileNo=" + mobileNo + "]";
	}

	public Customer() {
		super();
	}

	
	
}
