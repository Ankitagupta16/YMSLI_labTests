package com.test.service;

import com.test.dao.ObjectDao;
import com.test.dao.ObjectDaoImpl;
import com.test.dto.Book;
import com.test.dto.Chapter;
import com.test.dto.Publisher;

public class ObjectServiceImpl implements ObjectDao {
	
	private ObjectDao objectDao;
	
	public ObjectServiceImpl() {}
	
	public ObjectServiceImpl(ObjectDao objectDao) {
		this.objectDao = new ObjectDaoImpl();
	}


	@Override
	public void persistObjectGraph(Book book, Publisher publisher, Chapter chapter) {
		objectDao.persistObjectGraph(book, publisher, chapter);
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		return objectDao.retrieveObjectGraph(isbn);
	}

}
