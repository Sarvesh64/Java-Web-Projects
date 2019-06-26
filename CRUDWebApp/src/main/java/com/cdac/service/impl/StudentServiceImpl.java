package com.cdac.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.dao.StudentDao;
import com.cdac.model.Student;
import com.cdac.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public void add(Student student) {
		studentDao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		studentDao.edit(student);

	}

	@Transactional
	public void delete(int student) {
		studentDao.delete(student);

	}

	@Transactional
	public Student getStudent(int studentId) {
		
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		
		return studentDao.getAllStudent();
	}

}
