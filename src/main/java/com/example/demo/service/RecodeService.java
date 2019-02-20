package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Recode;

public interface RecodeService {
	public List<Recode> selectAll();
	
	public void insert(Recode r);
}
