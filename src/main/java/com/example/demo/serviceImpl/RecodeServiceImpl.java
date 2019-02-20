package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RecodeMapper;
import com.example.demo.entity.Recode;
import com.example.demo.service.RecodeService;

@Service
public class RecodeServiceImpl implements RecodeService {
	
	@Autowired
	RecodeMapper mapper;
	
	@Override
	public List<Recode> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public void insert(Recode r) {
		// TODO Auto-generated method stub
		mapper.insert(r);
	}

}
