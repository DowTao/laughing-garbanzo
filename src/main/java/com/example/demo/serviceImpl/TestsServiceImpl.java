package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestsMapper;
import com.example.demo.entity.Tests;
import com.example.demo.service.TestsService;

@Service
public class TestsServiceImpl implements TestsService{
	
	@Autowired
	TestsMapper mapper;
	
	@Override
	public List<Tests> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public List<Tests> selectById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	@Override
	public void insert(Tests t) {
		// TODO Auto-generated method stub
		mapper.insert(t);
	}

	@Override
	public void update(Tests t) {
		// TODO Auto-generated method stub
		mapper.update(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}


}
