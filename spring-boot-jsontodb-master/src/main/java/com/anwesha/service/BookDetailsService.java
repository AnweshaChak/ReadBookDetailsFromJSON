package com.anwesha.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.anwesha.domain.BookDetails;
import com.anwesha.repository.BookDetailsRepository;

@Service
public class BookDetailsService {
	
	private BookDetailsRepository bookDetailsRepository;
	
	public BookDetailsService(BookDetailsRepository bookDetailsRepository)
	{
		this.bookDetailsRepository = bookDetailsRepository;
	}

	public Iterable<BookDetails> list() {
        return bookDetailsRepository.findAll();
    }

    public BookDetails save(BookDetails book) {
        return bookDetailsRepository.save(book);
    }

    public void save(List<BookDetails> book) {
    	System.out.println("Inside service save");
    	bookDetailsRepository.save(book);
    }
   // @Transactional
    public List<BookDetails> ListByTitle(String title){
    	
    	Iterable<BookDetails> bookDetails = bookDetailsRepository.findAll();
    	List<BookDetails> filteredBookDetails = new ArrayList<BookDetails>();
    	
    	for(BookDetails details: bookDetails)
    	{
    		if(details.getTitle().contains(title)) {filteredBookDetails.add(details);}
    	}
    	
    	return filteredBookDetails;
    }
}
