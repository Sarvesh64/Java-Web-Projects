package com.cdac.spring.model;

public class Student {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Student(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
