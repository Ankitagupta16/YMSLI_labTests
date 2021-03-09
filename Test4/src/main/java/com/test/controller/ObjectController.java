package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import com.test.dto.Book;
import com.test.dto.Chapter;
import com.test.dto.Publisher;
import com.test.service.ObjectService;
import com.test.service.ObjectServiceImpl;

public class ObjectController {
	public static void main(String[] args) {
		
		ObjectService objectService = (ObjectService) new ObjectServiceImpl();
		
		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
//		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
//		chapters.add(chapter2);

//		book.setChapters(chapters);

		objectService.persistObjectGraph(book, publisher, chapter1);
	}
}
