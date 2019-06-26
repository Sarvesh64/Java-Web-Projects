package com.hibernate.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int pId;
	private String pFirstName;
	private String pLastName;
	public Person(int pId, String pFirstName, String pLastName) {
		super();
		this.pId = pId;
		this.pFirstName = pFirstName;
		this.pLastName = pLastName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpFirstName() {
		return pFirstName;
	}
	public void setpFirstName(String pFirstName) {
		this.pFirstName = pFirstName;
	}
	public String getpLastName() {
		return pLastName;
	}
	public void setpLastName(String pLastName) {
		this.pLastName = pLastName;
	}
	public Person() {
		super();
	}
	
	
}
