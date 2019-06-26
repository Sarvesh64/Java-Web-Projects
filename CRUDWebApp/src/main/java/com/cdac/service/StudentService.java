package com.cdac.service;

import java.util.List;

import com.cdac.model.Student;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int student);
	public Student getStudent(int studentId);
	public List getAllStudent();
}
