package com.amiti.Library_Management_Projectt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.IssueBooks;
import com.amiti.Library_Management_Projectt.repository.IssueBookRepo;

@Repository
public class IssueBookDao {
	
	@Autowired
	private IssueBookRepo repo;
	
	public IssueBooks saveIssueBook(IssueBooks books) {
		return repo.save(books);
	}
	
	public List<IssueBooks> getAllIssueBook(){
		return repo.findAll();
	}
	
	public IssueBooks getIssueBookById(int id) {
		return repo.findById(id).get();
	}
	
	public IssueBooks deleteIssueBook(int id) {
		IssueBooks books = repo.findById(id).get();
		repo.delete(books);
		return books;
	}
}
