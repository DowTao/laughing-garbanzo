package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tests;

@Repository
public interface TestsMapper {
	
	@Select("select * from tests where id = #{id}")
	public List<Tests> selectById(int id);
	
	@Select("select * from tests")
	public List<Tests> selectAll();
	
	@Insert("insert into tests(title, options, result) values (#{title}, #{options}, #{result})")
	public void insert(Tests t);
	
	@Insert("update tests set title = #{title}, options = #{options}, result = #{result}) where id = #{id}")
	public void update(Tests t);
	
	@Delete("delete from tests where id = #{id}")
	public void delete(int id);
}
