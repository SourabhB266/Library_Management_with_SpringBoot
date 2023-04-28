package com.amiti.Library_Management_Projectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
