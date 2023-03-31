package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();

	public Library() {
		
	}
	
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public boolean addBook(String title, String author) {
		Book book = new Book(title, author);
		return bookList.add(book);
	}
	
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println(book.toString() + " 삭제되었습니다.");
	}
	
	public void updateBook(int index) {
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
	}
	
	
	@Override
	public String toString() {
		int i = 0;
		for (Book book : bookList) {
			System.out.println(i + " : " + book.toString());
			i++;
		}
		return super.toString();
	}
	
}
