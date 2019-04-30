package com.anwesha.domain;



import javax.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Reviews {
	
	@JsonProperty
	private String reviewerName;
	@JsonProperty
	private String content;
	@JsonProperty
	private String rating;
	@JsonProperty
	private String publishedDate;
	
	public Reviews() {}
	
	

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}



	@Override
	public String toString() {
		return "Reviews [reviewerName=" + reviewerName + ", content=" + content + ", rating=" + rating
				+ ", publishedDate=" + publishedDate + "]";
	}
	
	
	

}
