package com.amiti.Library_Management_Projectt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.Book;
import com.amiti.Library_Management_Projectt.repository.BookRepo;

@Repository
public class BookDao {

	@Autowired
	private BookRepo bookRepo;

	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Book getBookById(int id) {
		Book book = bookRepo.findById(id).get();
		return book;
	}
	
	public Book deleteBook(int id) {
		Book book = bookRepo.findById(id).get();
		bookRepo.delete(book);
		return book;
	}
}
