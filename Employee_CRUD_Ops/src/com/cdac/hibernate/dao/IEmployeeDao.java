package com.cdac.hibernate.dao;

import org.hibernate.Transaction;

import com.cdac.hibernate.model.Employee;

public interface IEmployeeDao {

	public Employee addEmployee(Employee employee);
	public Transaction begin();
	public void commit();
}
