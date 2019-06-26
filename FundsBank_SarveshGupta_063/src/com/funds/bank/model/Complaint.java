/**
 * 
 */
package com.funds.bank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author HP
 *
 */

@Entity
@Table(name = "fundsbank")
public class Complaint implements Serializable {

	private static final long serialVersionUID = 451626921693338042L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;

	
	@Min(9)
	private Integer branchCode;
	private String emailId;
	private String complaintCategory;

	@NotEmpty(message = "Description cannot be empty!")
	private String description;

	// Parameterized Constructor
	public Complaint(Integer accountId, Integer branchCode, String emailId, String complaintCategory,
			String description) {
		super();
		this.accountId = accountId;
		this.branchCode = branchCode;
		this.emailId = emailId;
		this.complaintCategory = complaintCategory;
		this.description = description;
	}

	// Non- Parameterized Constructor
	public Complaint() {
		super();
	}

	// getters and setters for all the fields
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getComplaintCategory() {
		return complaintCategory;
	}

	public void setComplaintCategory(String complaintCategory) {
		this.complaintCategory = complaintCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Complaint [accountId=" + accountId + ", branchCode=" + branchCode + ", emailId=" + emailId
				+ ", complaintCategory=" + complaintCategory + ", description=" + description + "]";
	}

}
