package com.anwesha;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.anwesha.service.BookDetailsService;

import com.anwesha.domain.BookDetails;
import com.anwesha.domain.Reviews;

@SpringBootApplication
public class ReadBookDetailsFromJson {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ReadBookDetailsFromJson.class, args);
	}

	@Bean
	CommandLineRunner runner(BookDetailsService bookDetailsService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<BookDetails>> typeReference = new TypeReference<List<BookDetails>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/books.json");
			try {
				
				List<BookDetails> bookDetails = mapper.readValue(inputStream,typeReference);
				
				bookDetailsService.save(bookDetails);
				System.out.println("Book details Saved!");
				
				List<BookDetails> bookDetailswithTtile = bookDetailsService.ListByTitle("book");
				System.out.println("*********Books Detail with search letters #book#");
				for(BookDetails details : bookDetailswithTtile)
				{
					
					System.out.println("#############Search Result############### "+details);
				}
				
			} catch (IOException e){
				System.out.println("Unable to save details: " + e.getMessage());
			}
	    };
	    
	    
	}
	
	

}
