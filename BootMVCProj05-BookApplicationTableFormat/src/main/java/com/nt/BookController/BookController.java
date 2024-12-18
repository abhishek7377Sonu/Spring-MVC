package com.nt.BookController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.Book.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/book")
    public String getAllBooks(Model model) {
        List<Book> books = new ArrayList<>();
        // Populate the list of books (you can fetch from a database or any other source)
        books.add(new Book(1, "Book Title 1", "Author 1", 19.99));
        books.add(new Book(2, "Book Title 2", "Author 2", 29.99));
        books.add(new Book(3, "Book Title 3", "Author 3", 14.99));
        // Add the list of books to the model
        model.addAttribute("books", books);
        return "bookList"; // Return the logical view name
    }
}
