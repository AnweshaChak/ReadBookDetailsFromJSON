package com.anwesha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anwesha.domain.BookDetails;
import com.anwesha.service.BookDetailsService;

@RestController
@RequestMapping("/books")
public class BookDetailsController {
	
	private BookDetailsService bookDetailsService;
	
	public BookDetailsController(BookDetailsService bookDetailsService)
	{
		this.bookDetailsService = bookDetailsService;
		
	}
	@GetMapping("/list")
    public Iterable<BookDetails> list() {
        return bookDetailsService.list();
    }

}
