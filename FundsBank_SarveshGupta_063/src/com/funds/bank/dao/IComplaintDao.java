/**
 * 
 */
package com.funds.bank.dao;

import java.util.List;

import com.funds.bank.model.Complaint;


/**
 * @author HP
 *
 */
public interface IComplaintDao {
	public Integer addComplaint(Complaint complaint);//to insert the values in the database
	public List<Complaint> getComplaintList();// to retrieve the data from the database
}
