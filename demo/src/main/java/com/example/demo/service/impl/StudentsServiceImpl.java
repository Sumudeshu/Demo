package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.StudentsMapper;
import com.example.demo.pojo.Students;
import com.example.demo.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService{
	
	@Autowired
	private StudentsMapper studentsMapper;

	@Override
	public List<Students> findAll() {
		List<Students> list = studentsMapper.findAll();
		return list;
	}
	
	
}
