/**
 * 
 */
package com.funds.bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.funds.bank.model.Complaint;



/**
 * @author HP
 *
 */

@Repository
public class ComplaintDao implements IComplaintDao {

	
	private SessionFactory sessionFactory;
	
	private static final Logger logger = 			
			LoggerFactory.getLogger(ComplaintDao.class);
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("Session Factory : "+sessionFactory);
		this.sessionFactory = sessionFactory;
	}

	
	
	@Override
	public Integer addComplaint(Complaint complaint) {
		Session session = this.sessionFactory.openSession();
		Integer id=(Integer) session.save(complaint);
		logger.info("Complaint saved successfully, Complaint Details="
		+ complaint);
		return id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Complaint> getComplaintList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Complaint> complaintsList = session.createQuery("from Complaint").list();
		for (Complaint c : complaintsList) {
			logger.info("Complaint List::" + c);
		}
		return complaintsList;
	}

}
