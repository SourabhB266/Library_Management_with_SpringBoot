package com.amiti.Library_Management_Projectt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.User;
import com.amiti.Library_Management_Projectt.repository.UserRepo;

@Repository
public class UserDao {

	@Autowired
	private UserRepo repo;

	public User saveUser(User user) {
		repo.save(user);
		return user;
	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}

	public User deleteUser(int id) {
		User user = repo.findById(id).get();
		return user;
	}

	public User getUserById(int id) {
		return repo.findById(id).get();
	}
	
}
