package com.amiti.Library_Management_Projectt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.Library_Management_Projectt.dao.UserDao;
import com.amiti.Library_Management_Projectt.dto.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@CrossOrigin
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		dao.saveUser(user);
		return new ResponseEntity<>("Saved", HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> list = dao.getAllUsers();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getById")
	public ResponseEntity<User> getUserById(@RequestParam int id){
		User user =dao.getUserById(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
}
