package com.gaurav;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/books")
	public List<Books> getAllBooks() {
		Author george = new Author("George R.R. Martin", "Santa Fe, New Mexico");
		Author tolkien = new Author("J.R.R. Tolkien", "San Fransico, California");
		Author rowling = new Author("J.K Rowling", "London, England");
		
		List<Books> bookList = new ArrayList<>();
		bookList.add(new Books(23, "The Return of the King", tolkien));
		bookList.add(new Books(42, "A Dance with Dragons", george));
		bookList.add(new Books(32, "The Order of the phoenix", rowling));
		
		return bookList;
	}
}
