/**
 * 
 */
package com.funds.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.funds.bank.dao.IComplaintDao;
import com.funds.bank.model.Complaint;

/**
 * @author HP
 *
 */
@Service
public class ComplaintService implements IComplaintService {

	private IComplaintDao complaintDao;
	
	public IComplaintDao getComplaintDao() {
		return complaintDao;
	}
	@Autowired
	public void setComplaintDao(IComplaintDao complaintDao) {
		this.complaintDao = complaintDao;
	}

	@Override
	@Transactional
	public Integer addComplaint(Complaint complaint) {
		// TODO Auto-generated method stub
		return complaintDao.addComplaint(complaint);
	}

	@Override
	@Transactional
	public List<Complaint> getComplaintList() {
		// TODO Auto-generated method stub
		return complaintDao.getComplaintList();
	}

}
