package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Tests;

public interface TestsService {
	public List<Tests> selectById(int id);
	
	public List<Tests> selectAll();
	
	public void insert(Tests t);
	
	public void update(Tests t);
	
	public void delete(int id);
}
