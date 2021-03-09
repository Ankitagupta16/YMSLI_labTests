package com.test.service;

import com.test.dto.Book;
import com.test.dto.Chapter;
import com.test.dto.Publisher;

public interface ObjectService {
	public void persistObjectGraph(Book book, Publisher publisher, Chapter chapter);
	public Book retrieveObjectGraph(String isbn);
}
