package com.amiti.Library_Management_Projectt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.Library_Management_Projectt.dao.AdminDao;
import com.amiti.Library_Management_Projectt.dto.Admin;

@RestController
public class AdminController {
	
	@Autowired
	private AdminDao adminDao;
	
	@CrossOrigin
	@GetMapping("/getAdminByName")
	public ResponseEntity<Admin> getAdminByName(@RequestParam String name){
		Admin admin = adminDao.getAdminByName(name);
		return new ResponseEntity<>(admin,HttpStatus.OK);
	}
}
