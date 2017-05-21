package com.srikar.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	private String name;
	@Id
	private String email;
	private String message;
	private int rating;
	
	public Feedback(){}
	
	public Feedback(String name, String email, String message, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", message=" + message + ", rating=" + rating + "]";
	}
	
	
	
}
