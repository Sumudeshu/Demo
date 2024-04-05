package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.pojo.Students;

@Mapper
public interface StudentsMapper {
	/**
	  * 查询所有用户
	  */
	 public List<Students> findAll();
	 
	 /**
	  * 增
	  * @param student
	  * @return
	  */
	 int create(Students student);
}
