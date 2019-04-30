package com.anwesha.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookDetailsServiceTest {
	
	
	@Autowired
	BookDetailsService bookDetailsService;
	
	@Test
	public void ListByTitle()
	{
		assertNotNull(bookDetailsService.ListByTitle("Java"));
	}
	

}
