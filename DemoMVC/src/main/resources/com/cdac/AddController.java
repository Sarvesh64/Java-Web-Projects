package com.cdac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	@RequestMapping(value="/add")
	public void add() {
		System.out.println("I am here");
	}
}