/**
 * 
 */
package com.funds.bank.service;

import java.util.List;

import com.funds.bank.model.Complaint;

/**
 * @author HP
 *
 */
public interface IComplaintService {
	public Integer addComplaint(Complaint complaint);//to insert the values 
	public List<Complaint> getComplaintList();// to retrieve the data from the DAO layer
}
