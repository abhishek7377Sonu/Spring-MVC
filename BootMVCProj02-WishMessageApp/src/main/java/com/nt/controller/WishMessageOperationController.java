package com.nt.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishService;



@Controller
public class WishMessageOperationController {

	@Autowired
	private IWishService service;
	
	@RequestMapping("/home")
	public String showHomePage() {
		return  "welcome";
	}
	
//	@RequestMapping("/wish")
//	public ModelAndView fetchWishMessage() {
//	//use service
//		String msg=service.generateWishMessage();
//	//	keep results and other data   as Model attributes in MAV object
//		
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("wMsg", msg);//attribute name, value
//		mav.addObject("sysDate", new Date());//attribute name, value
//		mav.setViewName("show_result");
//		return mav;
//		
//	}
	
	/*
	//Data Rendering
	@RequestMapping("/wish")
	public String  fetchWishMessage(HashMap<String,Object>map) {
		System.out.println("shared memory obj class name"+map.getClass());
	//use service
	String msg=service.generateWishMessage();
	//	keep results and other data   as Model attributes 
		map.put("wMsg", msg);
		map.put( "sysDate", new Date());
		
		//return MAV
		return "show_result";
}
*/
	
	//Model 
	/*
	@RequestMapping("/wish")
	public String  fetchWishMessage(Model model) {
		System.out.println("shared memory obj class name"+model.getClass());
	//use service
	String msg=service.generateWishMessage();
	//	keep results and other data   as Model attributes 
		model.addAttribute("wMsg", msg);
		model.addAttribute( "sysDate", new Date());
		
		//return MAV
		return "show_result";
	}
	
	*/ 
	/*
	//ModelMap
	//=============================
	@RequestMapping("/wish")
	public String  fetchWishMessage(ModelMap modelmap) {
		System.out.println("shared memory obj class name"+modelmap.getClass());
	//use service
	String msg=service.generateWishMessage();
	//	keep results and other data   as Model attributes 
		modelmap.addAttribute("wMsg", msg);
		modelmap.addAttribute( "sysDate", new Date());
		
		//return MAV
		return "show_result";
	}
	*/
	
	/*
	//This is the best approach
	// Using Map
	@RequestMapping("/wish")
	public String  fetchWishMessage(Map<String,Object>map) {
		System.out.println("shared memory obj class name"+map.getClass());
	//use service
	String msg=service.generateWishMessage();
	//	keep results and other data   as Model attributes 
		map.put("wMsg", msg);
		map.put( "sysDate", new Date());
		
		//return MAV
		return "show_result";
}
*/

	
	//If no logical  view name is taken then  the request path of the handler method by excluding " / " becomes LVN.. 
	@RequestMapping("/wish")
	public ModelMap  fetchWishMessage() {
	
	//use service
	String msg=service.generateWishMessage();
	//	keep results and other data   as Model attributes 
	ModelMap map=new BindingAwareModelMap();
		map.addAttribute("wMsg", msg);
		 map.addAttribute( "sysDate", new Date());
		
		//return MAV
	return  map;
	}
	

}