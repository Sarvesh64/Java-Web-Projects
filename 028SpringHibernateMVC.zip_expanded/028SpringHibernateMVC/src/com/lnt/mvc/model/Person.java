package com.lnt.mvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
/* * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 */
 /** @author Smita *
 *create table MYPERSON (personId number primary key, name varchar2(30),country varchar2(30));
 */
@Entity
@Table(name="MYPERSON")
public class Person {
	@Id
	@Column(name="person_Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer personId;
	
	
	@Size(max = 20, min = 3, 
			message = " Name entered is invalid. It must be between 3 and 20 characters.")
	@Column(name="branch")
	private String name;
	
	@NotEmpty(message = "Country Name cannot be empty!")
	@Column(name="country")
	private String country;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	public Person(Integer personId, String name, String country, String category, String description) {
		super();
		this.personId = personId;
		this.name = name;
		this.country = country;
		this.category = category;
		this.description = description;
	}
	public Person() {
		super();
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
