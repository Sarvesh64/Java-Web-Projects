package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.service.IStudentService;

@Controller
public class StudentController {
	
	private IStudentService studentService;

	public IStudentService getStudentService() {
		return studentService;
	}
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	@RequestMapping("/")
	public String getHome() {
		return "index";
	}
}
