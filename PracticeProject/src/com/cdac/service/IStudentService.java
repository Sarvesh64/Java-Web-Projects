package com.cdac.service;

import java.util.List;

import com.cdac.model.Student;

public interface IStudentService {
	
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
}
