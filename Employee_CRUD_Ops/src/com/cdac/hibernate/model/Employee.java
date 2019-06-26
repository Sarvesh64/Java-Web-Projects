package com.cdac.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Integer empId;
private String empName;
private String empDesg;
private double empSal;
public Employee() {
	super();
}
public Employee(Integer empId, String empName, String empDesg, double empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDesg = empDesg;
	this.empSal = empSal;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDesg() {
	return empDesg;
}
public void setEmpDesg(String empDesg) {
	this.empDesg = empDesg;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + ", empSal=" + empSal + "]";
}


}
