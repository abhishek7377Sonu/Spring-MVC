package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring Boot!");
		mav.setViewName("welcome");
		return mav;
	}

	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good Evening!");
		mav.setViewName("greet");
		return mav;
	}
}
