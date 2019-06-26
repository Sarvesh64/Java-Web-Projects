package com.cdac.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.model.Student;

@Repository
public class StudentDao implements IStudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Student addStudent(Student student) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(student);
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents() {
		Session session=this.sessionFactory.getCurrentSession();
		return session.createQuery("from Student").list();
	}

}
