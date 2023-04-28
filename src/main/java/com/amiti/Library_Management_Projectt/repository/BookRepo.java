package com.amiti.Library_Management_Projectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amiti.Library_Management_Projectt.dto.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
