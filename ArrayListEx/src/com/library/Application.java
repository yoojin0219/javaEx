package com.library;

public class Application {

	public static void main(String[] args) {
		
		Library lib = new Library();
		
		lib.addBook("책1", "작가1");
		lib.addBook("책2", "작가2");
		lib.addBook("책3", "작가3");
			
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택해주세요.");
		int i = 0;
		
		lib.removeBook(i);
		
		lib.toString();
		
		System.out.println("대여할 책 번호를 선택해주세요.");
		i = 0;
		
		lib.updateBook(i);
		
		lib.toString();
		
		
	}
	
}
