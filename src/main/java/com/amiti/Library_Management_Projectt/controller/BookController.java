package com.amiti.Library_Management_Projectt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.Library_Management_Projectt.dao.BookDao;
import com.amiti.Library_Management_Projectt.dto.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookDao dao;
	
	@CrossOrigin
	@PostMapping("/saveBook")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		dao.saveBook(book);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> list =dao.getAllBooks();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getBookById")
	public ResponseEntity<Book> getBookById(@RequestParam int id){
		Book book = dao.getBookById(id);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/deleteBook")
	public ResponseEntity<Book> deleteBook(@RequestParam int id){
		Book book = dao.deleteBook(id);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
}
