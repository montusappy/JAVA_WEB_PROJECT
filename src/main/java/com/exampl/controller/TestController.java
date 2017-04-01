package com.exampl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import com.exampl.model.Student;

@Controller
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> printHello(ModelMap model) {
		
		
		
		return studList;

	}

}
