package com.validation.el;
import java.io.Serializable;
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	//business method status
	public String getStatus(){
		if(username.equals("sarvesh")
				&&password.equals("sarvesh123"))
			//System.out.println("Valid User");
			return "Valid ";
		else
			//System.out.println("InValid User");
			return "InValid ";
	}	
}