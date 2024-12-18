package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.binding.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayForm(Model model) {
	    Book bookObj = new Book();
	    model.addAttribute("book", bookObj);
	    return "index"; // Make sure the view name matches the template name
	}



    @PostMapping("/book")
    public String saveBook( Book book, Model model){
        System.out.println(book);
        model.addAttribute("msg", "Book saved successfully");
        return "success";
    }
}
