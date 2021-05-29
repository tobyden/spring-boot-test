package com.mars.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyException {

	@ExceptionHandler(value={java.lang.ArithmeticException.class})
	public ModelAndView arithmeticExceptionHandler(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", e.toString());
		mv.setViewName("error1");
		
		return mv;
	}
	
	@ExceptionHandler(value={java.lang.NullPointerException.class})
	public ModelAndView nullPointerExceptionHandler(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", e.toString());
		mv.setViewName("error2");
		
		return mv;
	}
}
