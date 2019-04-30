package com.anwesha.repository;

import org.springframework.data.repository.CrudRepository;

import com.anwesha.domain.BookDetails;

public interface BookDetailsRepository extends CrudRepository<BookDetails, Long> {

}
