package com.nt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.binding.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String getProductForm(Model model) {

		Product product = new Product();
		model.addAttribute("product", product);
		// This model obj created by the container
		return "index";

	}

	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("msg", "product saved successfully");

		return "success";

	}

}
