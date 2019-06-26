package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MyMainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Person person = new Person();
		person.setpId(100);
		person.setpFirstName("Sarvesh");
		person.setpLastName("Gupta");

		session.save(person);
		 session.getTransaction().commit();
		  session.close();
		
	}

}
