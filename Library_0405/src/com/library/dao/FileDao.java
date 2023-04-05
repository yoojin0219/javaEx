package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	@Override
	public List<Book> getList() {
		// 파일로부터 데이터를 읽어 리스트로 반환
		//System.out.println("FileDao.getlist() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();
		
		try (FileReader fr = new FileReader("bookList.txt");
				// 보조 스트림은 단독으로 사용 불가
				BufferedReader br = new BufferedReader(fr);) {
			
			String readLine = "";
			
			while ((readLine = br.readLine()) != null) {
				Book book = makeBook(readLine);
				
				if (book != null) {
					list.add(book);
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		
		//System.out.println("FileDao.getlist() 종료");
		
		return list;
	}
	
	
	
	
	
	private Book makeBook(String readLine) {
		Book book = null;
		
		String[] RlArr = readLine.split(" ");
		
		try {
			int no = Integer.parseInt(RlArr[0]);
			String title = RlArr[1];
			String author = RlArr[2];
			boolean isRent = Boolean.parseBoolean(RlArr[3]);
			
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			System.err.println(readLine + " : 파싱 중 오류가 발생했습니다.");
		}
		
		return book;
		
		
	}





	@Override
	public boolean listToFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt");) {
			
			for (Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			
			return true;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		return false;
	}
	
	
	
}
