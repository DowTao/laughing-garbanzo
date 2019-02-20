package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Recode;

@Repository
public interface RecodeMapper {
	
	@Select("select * from recode")
	public List<Recode> selectAll();
	
	@Insert("insert into recode(name, date, point) values (#{name}, #{date}, #{point})")
	public void insert(Recode r);
	
}
