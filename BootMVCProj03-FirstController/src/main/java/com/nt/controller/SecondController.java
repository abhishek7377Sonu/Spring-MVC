package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

	@GetMapping("/wish")
	public ModelAndView getWishMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "All the best");
		mav.setViewName("wish");
		return mav;
	}
}
