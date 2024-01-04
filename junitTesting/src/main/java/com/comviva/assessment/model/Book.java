package com.comviva.assessment.model;

public class Book {

	private String title;
	private String author;
	private boolean isavailable;
	public Book(String title, String author) {
	this.title = title;
	this.author = author;
	this.isavailable = true;
	}
	public String getTitle() {
	return title;
	}
	public String getAuthor() {
	return author;
	}
	public boolean isAvailable() {
	return isavailable;
	}
	public void setAvailable(boolean isavailable) {
	this.isavailable = isavailable;
	}
}
