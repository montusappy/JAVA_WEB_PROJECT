package com.exampl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exampl.model.Student;
import com.exampl.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	public List<Student> getStudentDetails() {
		List<Student> studList = new ArrayList<Student>();
		Student stud = new Student();
		stud.setStudId(111);
		stud.setStudName("Sappy");
		stud.setStudRoll(11);
		studList.add(stud);
		return studList;

	}

}
