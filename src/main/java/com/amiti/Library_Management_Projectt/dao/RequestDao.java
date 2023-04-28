package com.amiti.Library_Management_Projectt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.Library_Management_Projectt.dto.Request;
import com.amiti.Library_Management_Projectt.repository.RequestRepo;

@Repository
public class RequestDao {

	@Autowired
	private RequestRepo repo;

	public Request saveRequest(Request request) {
		return repo.save(request);
	}

	public List<Request> getAllRequest() {
		return repo.findAll();
	}

	public Request deleteRequest(int id) {
		Request request = repo.findById(id).get();
		repo.delete(request);
		return request;
	}
}
