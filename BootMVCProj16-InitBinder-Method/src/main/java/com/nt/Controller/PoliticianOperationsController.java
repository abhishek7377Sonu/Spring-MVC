package com.nt.Controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.PoliticianProfile;

@Controller
public class PoliticianOperationsController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("PoliticianOperationsController.showHome()");
		// return LVN
		return "home";

	}

	@GetMapping("/register")
	public String showFormPage(@ModelAttribute("pp") PoliticianProfile profile) {

		System.out.println("PoliticianOperationsController.showFormPage()");
		System.out.println("Model class obj data :: " + profile);
		// return LVN
		return "politiciation_register";

	}
@PostMapping("/register")
	public String registerPolitician(@ModelAttribute("pp") PoliticianProfile profile) {

		System.out.println("PoliticianOperationsController.showFormPage()");
		System.out.println("Model class obj data :: " + profile);

		// By invoking service class ...u can execute b.logic
		// return LVN
		return "show_result";

	}

	/*@InitBinder is used to customize the data binding process for web requests.
	It allows you to control how Spring binds HTTP request parameters to Java objects*/
	@InitBinder
	public void myDateBinder(WebDataBinder binder) {
		System.out.println("PoliticianOperationsController.myDateBinder()");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, true));
		
	}
}
