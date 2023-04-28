package com.amiti.Library_Management_Projectt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amiti.Library_Management_Projectt.dto.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {



	Admin getAdminByUsername(String name);

}
