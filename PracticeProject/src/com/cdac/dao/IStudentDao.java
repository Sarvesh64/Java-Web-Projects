package com.cdac.dao;

import java.util.List;

import com.cdac.model.Student;

public interface IStudentDao {
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
}
