/**
 * 
 */
package com.funds.bank.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HP
 *
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception e) {

		ModelAndView mav = new ModelAndView("exception");// view name
		mav.addObject("name", e.getClass().getSimpleName());// model for ex name
		mav.addObject("message", e.getMessage());// model for ex msg
		return mav;
	}
}