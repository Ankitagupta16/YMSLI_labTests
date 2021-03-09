package com.test.dao;

import com.test.dto.Book;
import com.test.dto.Chapter;
import com.test.dto.Publisher;

public interface ObjectDao {
	public void persistObjectGraph(Book book, Publisher publisher, Chapter chapter);
	public Book retrieveObjectGraph(String isbn);
}
