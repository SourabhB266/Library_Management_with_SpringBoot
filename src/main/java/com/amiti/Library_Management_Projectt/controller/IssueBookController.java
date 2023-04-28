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

import com.amiti.Library_Management_Projectt.dao.IssueBookDao;
import com.amiti.Library_Management_Projectt.dto.IssueBooks;

@RestController
public class IssueBookController {

	@Autowired
	private IssueBookDao dao;

	@CrossOrigin
	@PostMapping("/saveIssueBook")
	public ResponseEntity<IssueBooks> saveIssueBooks(@RequestBody IssueBooks books) {
		dao.saveIssueBook(books);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getAllIssueBook")
	public ResponseEntity<List<IssueBooks>> getAllIssueBooks() {
		List<IssueBooks> list =dao.getAllIssueBook();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getIssueBookById")
	public ResponseEntity<IssueBooks> getIssueBookById(@RequestParam int id) {
		IssueBooks issueBooks = dao.getIssueBookById(id);
		return new ResponseEntity<>(issueBooks, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/deleteIssueBook")
	public ResponseEntity<IssueBooks> deleteIssueBook(@RequestParam int id) {
		IssueBooks issueBooks = dao.deleteIssueBook(id);
		return new ResponseEntity<>(issueBooks, HttpStatus.OK);
	}
}
