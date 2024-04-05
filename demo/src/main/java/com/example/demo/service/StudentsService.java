package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.Students;

@Service
public interface StudentsService {
	
	public List<Students> findAll();
	
	int create(Students student);
}
