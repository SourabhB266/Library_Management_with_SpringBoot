package com.amiti.Library_Management_Projectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amiti.Library_Management_Projectt.dto.IssueBooks;

public interface IssueBookRepo extends JpaRepository<IssueBooks, Integer>{

}
