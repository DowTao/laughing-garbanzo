package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Tests;

import com.example.demo.service.TestsService;

@Controller
@RequestMapping("Tests")
public class TestController {
	
	@Autowired
	TestsService service;
	
	@RequestMapping("index")
	public String index(Model m) {
		m.addAttribute("list", service.selectAll());
		return "/Tests/index";
	}
	
	@RequestMapping("edit")
	public String edit() {
		return "Tests/edit";
	}
	
	@RequestMapping("save")
	public String save(Tests t, Model m) {
		service.insert(t);
		return index(m);
	}
}
