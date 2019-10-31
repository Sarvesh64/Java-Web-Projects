package com.hibernate.practice;

import org.apache.log4j.BasicConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyMainClass {

	public static void main(String[] args) {

		Person person = new Person();
		person.setpId(100);
		person.setpFirstName("Sarvesh");
		person.setpLastName("Gupta");
		
		Configuration con = new Configuration().configure();
		SessionFactory sessionFactory = con.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(person);
	}

}