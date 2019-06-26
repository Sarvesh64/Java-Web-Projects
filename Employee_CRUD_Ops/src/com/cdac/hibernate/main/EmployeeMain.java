package com.cdac.hibernate.main;

import com.cdac.hibernate.model.Employee;
import com.cdac.hibernate.service.EmployeeService;
import com.cdac.hibernate.service.IEmployeeService;

public class EmployeeMain {
	private static IEmployeeService employeeService;
	
	static {
		employeeService=new EmployeeService();
	}

	public static void main(String[] args) {
		Employee employee = new Employee(100,"Sarvesh","Dev",10000.00 );
		System.out.println("Inserted element is ");
		System.out.println("INserted value is " + employeeService.addEmployee(employee));
	}

}
