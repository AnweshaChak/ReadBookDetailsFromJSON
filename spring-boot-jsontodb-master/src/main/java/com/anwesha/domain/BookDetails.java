package com.anwesha.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class BookDetails {
	
		@Id
		@GeneratedValue( strategy = GenerationType.AUTO )
		private Integer id;
		@JsonProperty
		private String title;
		@JsonProperty
		private String author;
		@JsonProperty
		private String publishedDate;
		@JsonProperty
		private Long isbn;
		
		
		@ElementCollection(targetClass = Reviews.class, fetch = FetchType.EAGER)
		private List<Reviews> reviews ;
		
		
		public BookDetails() {}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getPublishedDate() {
			return publishedDate;
		}


		public void setPublishedDate(String publishedDate) {
			this.publishedDate = publishedDate;
		}


		public Long getIsbn() {
			return isbn;
		}


		public void setIsbn(Long isbn) {
			this.isbn = isbn;
		}


		public List<Reviews> getReviews() {
			return reviews;
		}


		public void setReviews(List<Reviews> reviews) {
			this.reviews = reviews;
		}


		@Override
		public String toString() {
			return "BookDetails [id=" + id + ", title=" + title + ", author=" + author + ", publishedDate="
					+ publishedDate + ", isbn=" + isbn + ", reviews=" + reviews + "]";
		}

		
		
}
