package com.sarvesh.hibernateinheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class MyMainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Person person = new Person();
		  person.setFirstName("Sarvesh");
		  person.setLastName("Gupta");
		  
		  Customer customer = new Customer();
		  customer.setFirstName("Sarvesh");
		  customer.setLastName("Gupta");
		  customer.setMobileNo("654654321");

		  
		  OnlineCustomer onlineCustomer = new OnlineCustomer();
		  onlineCustomer.setFirstName("Sarvesh");
		  onlineCustomer.setLastName("Gupta");
		  onlineCustomer.setMobileNo("654654321");
		  onlineCustomer.setEmail("a@gmail.com");
		  
		  session.save(person);
		  session.save(customer);
		  session.save(onlineCustomer);
		  
		  session.getTransaction().commit();
		  session.close();
	}

}
