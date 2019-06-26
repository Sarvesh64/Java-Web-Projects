/**
 * 
 */
package com.funds.bank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.funds.bank.model.Complaint;
import com.funds.bank.service.IComplaintService;


/**
 * @author HP
 *
 */
@Controller
public class ComplaintController {
	
	private IComplaintService complaintService;

	public IComplaintService getComplaintService() {
		return complaintService;
	}
	
	@Autowired
	@Qualifier(value = "complaintService")
	public void setComlpaintService(IComplaintService complaintService) {
		this.complaintService = complaintService;
	}
	
	// For adding  complaint
		@RequestMapping(value = "/complaint/add", 
				method = RequestMethod.POST)
		public String addComplaint(
				@ModelAttribute("complaint") 
				@Valid Complaint complaint, 
				BindingResult result, 
				Model model) {
			
				if (complaint.getAccountId() == null) {
//					 new complaint, add it
					Integer id=this.complaintService.addComplaint(complaint);
					model.addAttribute("id",id);
				
			}
		//	model.addAttribute("listComplaints", this.complaintService.getComplaintList());
			return new String("success");
		}

		//To fetch the records which will return viewname
		@RequestMapping(value = "/complaints", method = RequestMethod.GET)
		public String getComplaintList(Model model) {
			model.addAttribute("complaint", new Complaint());
			model.addAttribute("getComplaintList", 
					this.complaintService.getComplaintList());
			return "complaint";
		}

		@RequestMapping("/showErrorPage/error")
		@ExceptionHandler(Exception.class)
		public ModelAndView exception(Exception e) {

			ModelAndView mav = new ModelAndView("error");// view name
			mav.addObject("exName", e.getClass().getSimpleName());// model for ex name
			mav.addObject("exMessage", e.getMessage());// model for ex msg
			return mav;
		}
		@RequestMapping(value="/success")
		public String success() {
			return "success";	
		}
		public String checkStatus() {
			return null;
			
		}

}

