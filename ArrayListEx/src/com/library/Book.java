package com.library;

public class Book {

	private String title;
	private String author;
	private boolean isRent;
	
		
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		String str = "";
		if (isRent) {
			str = "(대여중)";
		}
		return this.title + "/" + this.author + str;
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
		author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
}
