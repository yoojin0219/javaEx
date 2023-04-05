package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {

	// 파일을 읽어서 리스트 반환
	
	List<Book> getList();
	
	boolean listToFile(List<Book> list);
}
