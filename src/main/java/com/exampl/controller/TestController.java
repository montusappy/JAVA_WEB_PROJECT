package com.exampl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exampl.model.Student;
import com.exampl.service.StudentService;

@Controller
public class TestController {

	@Autowired
	@Qualifier("studentServiceImpl")
	StudentService studService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printStudent(ModelAndView model) {

		List<Student> studList = studService.getStudentDetails();
		ModelAndView view = new ModelAndView();
		view.setViewName("studDisplay");
		view.getModelMap().addAttribute("studentList", studList);
		return view;
	}

}