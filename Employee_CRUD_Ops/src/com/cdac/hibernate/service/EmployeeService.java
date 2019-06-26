package com.cdac.hibernate.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cdac.hibernate.dao.EmployeeDao;
import com.cdac.hibernate.dao.IEmployeeDao;
import com.cdac.hibernate.model.Employee;

public class EmployeeService implements IEmployeeService {
	private IEmployeeDao employeeDao;
	private Transaction transaction;
	private Session session;
	
	
	public EmployeeService() {
		employeeDao=new EmployeeDao();
	}


	@Override
	public Employee addEmployee(Employee employee) {
		employeeDao.begin();
		
		Employee addedEmployee=employeeDao.addEmployee(employee);
		employeeDao.commit();
		
		return addedEmployee;
	}

}
