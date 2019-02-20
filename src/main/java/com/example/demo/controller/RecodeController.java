package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Recode;
import com.example.demo.service.RecodeService;
import com.example.demo.service.TestsService;

@Controller
@RequestMapping("Recode")
public class RecodeController {
	
	@Autowired
	RecodeService service;
	
	@Autowired
	TestsService tservice;
	
	@RequestMapping("index")
	public String index(Model m) {
		m.addAttribute("list", service.selectAll());
		return "/Recode/index";
	}
	
	@RequestMapping("test")
	public String test(Model m) {
		m.addAttribute("list", tservice.selectAll());
		return "/Recode/edit";
	}
	
	@RequestMapping("save")
	public String save(Recode r, Model m) {
		r.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		service.insert(r);
		return index(m);
	}
}
