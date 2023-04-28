package com.amiti.Library_Management_Projectt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.Admin;
import com.amiti.Library_Management_Projectt.repository.AdminRepo;

@Repository
public class AdminDao {
	
	@Autowired
	private AdminRepo adminRepo;
	
	public Admin getAdminByName(String name) {
		return adminRepo.getAdminByUsername(name);
	}
}
