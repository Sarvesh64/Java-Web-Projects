package com.cdac.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.IStudentDao;
import com.cdac.model.Student;

@Service
public class StudentService implements IStudentService {
	
	
	private IStudentDao studentDao;
	
	public IStudentDao getStudentDao() {
		return studentDao;
	}
	@Autowired
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	@Transactional
	public Student addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

}
