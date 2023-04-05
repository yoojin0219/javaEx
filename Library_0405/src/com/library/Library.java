package com.library;

import java.util.List;

import com.library.dao.*;
import com.library.vo.Book;

public class Library {
	
	// 책 목록
	List<Book> list = null;
	
	Dao dao = new FileDao();
	
	
	// 생성자 
	
	Library(){
		list = dao.getList();
	}

	
	// 메소드
	
	@Override
	public String toString() {
		System.out.println("----- 도서 목록 -----");
		String info = "";
		for (Book book : list) {
			info += book.toString() + "\n";
		}
	
			return info;
	}
	
	
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		// 0. 일련번호 중복 체크
		for (Book book : list) {
			if (book.getNo() == no) {
				System.err.println("일련번호가 중복되었습니다.\n확인 후 다시 입력해주세요.");
				return false;
			}
		}
		
		// 1. 도서 생성
		Book book = new Book(no, title, author, isRent);
		
		// 2. 리스트에 등록
		list.add(book);
		
		// 3. 리스트를 파일로 출력
		boolean res = dao.listToFile(list);
		
		// 4. 파일에 정상적으로 등록되지 않은 경우 리스트에서 제거
		if (!res) {
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다.\n관리자에게 문의해주세요.");
			return false;
		}
		System.out.println("책이 등록되었습니다.");
		System.out.println(toString());
		return true;
	}


	public boolean deleteBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				list.remove(book);
				boolean res = dao.listToFile(list);
				if(!res) {
					list.add(book);
					System.err.println("파일 출력 도중 오류가 발생했습니다.\nLibrary.deleteBook");
					return false;
				}
				System.out.println("도서가 삭제되었습니다.");
				System.out.println(toString());
				return true;
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.\n일련번호를 확인해주세요.");
		return false;
		
	}
	
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					System.err.println("이미 대출중인 도서입니다.");
				} else {
					book.setRent(true);
//					dao.listToFile(list);
					System.out.println(toString());
					System.out.println("대출이 완료되었습니다.");
				}
			} else {
				System.err.println("일련번호를 확인해주세요.");
			}
		}
		
		return false;
	}
	
	
	
	
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					book.setRent(false);
//					dao.listToFile(list);
					System.out.println("반납이 완료되었습니다.");
					System.out.println(toString());
				} else {
					System.err.println("일련번호를 확인해주세요.");
				}
			}
		}
		
		return false;
	}
	

}
