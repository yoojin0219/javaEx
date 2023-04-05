package com.library;

import java.util.Scanner;

public class App {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Library lib = new Library();

		
		while (true) {
			System.out.print("ID : ");
			String id = getString();
			if (id.equalsIgnoreCase("admin")) {
				System.out.println("관리자로 로그인 되었습니다.");
				outter :
				while (true) {
					System.out.println("1. 도서 등록 | 2. 도서 삭제 | 0. 로그아웃 | q. 프로그램 종료");
					System.out.print("메뉴를 입력해주세요 : ");
					int menu = getInt();
					switch (menu) {
					case 1:
						System.out.println("인덱스 | 제목 | 작가");
						int no = getInt();
						String title = getString();
						String author = getString();
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.println(lib.toString());
						System.out.print("삭제할 도서 번호 : ");
						int index = getInt();
						lib.deleteBook(index);
						break;
					case 0:
						System.out.println("로그아웃 되었습니다.");
						break outter;

					default:
						System.out.println("메뉴를 잘못 입력하셨습니다.");
						break;
					}
				}
			} else {
				System.out.println(id + "님, 환영합니다.");
				while (true) {
					System.out.println("1. 도서 대출 | 2. 도서 반납 | 0. 로그아웃 | q. 프로그램 종료");
					
					
				}
				
			}
			
			
		}
		
		
		
//		//책 추가
//		lib.insertBook(1, "책1", "작가1", false);
//		lib.insertBook(2, "책2", "작가2", false);
//		
//		// 책 삭제
//		lib.deleteBook(1);
//		
//		// 책 대여
//		lib.rentBook(2);
//		
//		// 책 반납
//		lib.returnBook(2);
	}

	
	
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} 
				
				i = Integer.parseInt(str);
				
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	public static String getString() {
		String res = "";
		while(true) {
			try {
				res = scan.next();
				
				try {
					Integer.parseInt(res);
					System.out.print("문자를 입력해주세요. ");
					continue;
				} catch (Exception e) {
					
				}
				
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} 
				break;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생했습니다.");
				System.err.println("문자를 입력해주세요.");
			}
		}
		return res;
	}
}

