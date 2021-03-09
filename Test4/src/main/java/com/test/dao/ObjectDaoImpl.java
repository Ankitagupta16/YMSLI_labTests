package com.test.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.dto.Book;
import com.test.dto.Chapter;
import com.test.dto.Publisher;

public class ObjectDaoImpl implements ObjectDao {

	private SessionFactory sessionFactory;

	public ObjectDaoImpl() {
		this.sessionFactory = HibernateSessionFactory.getSessionFactory();
	}

	@Override
	public void persistObjectGraph(Book book, Publisher publisher, Chapter chapter) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		try {
			tx.begin();
			
			session.save(book);

			tx.commit();

		} catch (HibernateException ex) {
			tx.rollback();
			throws DataAccessAcception();
		}
	}

	@Override
	public Book retrieveObjectGraph(String isbn) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		Book book = new Book();
		try {
			tx.begin();
			
			book = session.get(Book.class, isbn);
			tx.commit();

		} catch (HibernateException ex) {
			tx.rollback();
		}
		
		return book;
	}
}
