package com.amiti.Library_Management_Projectt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.Library_Management_Projectt.dao.RequestDao;
import com.amiti.Library_Management_Projectt.dto.Request;

@RestController
public class RequestController {

	@Autowired
	private RequestDao dao;

	@CrossOrigin
	@PostMapping("/saveRequest")
	public ResponseEntity<Request> saveRequest(@RequestBody Request request) {
		dao.saveRequest(request);
		return new ResponseEntity<>(request, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping("/getAllRequest")
	public ResponseEntity<List<Request>> sgetAllRequest() {
		List<Request> list = dao.getAllRequest();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("deleteRequest")
	public ResponseEntity<Request> deleteRequest(@RequestParam int id) {
		Request request=dao.deleteRequest(id);
		return new ResponseEntity<>(request, HttpStatus.OK);
	}
}
