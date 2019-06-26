package com.cdac.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.spring.model.Student;

@Controller
public class HomeController {
	@RequestMapping(value="/index")
	public String getIndexPage(Model model) {
		model.addAttribute("msg", "welcome to spring MVC");
		return "index";
	}
	
	@RequestMapping(value="showStudentForm")
	public String displayStudentForm(Model model)
	{
		Student std = new Student();
		model.addAttribute("studentObj", std);
	return "studentRegistration";
	}
	
	@RequestMapping(value="registerStudent", method=RequestMethod.POST)
	public String registerStudent(@ModelAttribute Student student, Model model)
	{
		model.addAttribute("student",student);
	model.addAttribute("msg","student Registered Successfully!!");
	return "studentRegSuccess";
	}
}
