package com.cdac.hibernate.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.hibernate.model.Employee;

public class EmployeeDao implements IEmployeeDao {
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	
	public EmployeeDao() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("The employee is : "+employee);
		session.save(employee);
		
		return employee;
	}

	@Override
	public Transaction begin() {
		transaction=session.beginTransaction();
		
		return transaction;
	}

	@Override
	public void commit() {
		transaction.commit();		
	}

}
