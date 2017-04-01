package com.exampl.service;

import java.util.ArrayList;
import java.util.List;
import com.exampl.model.Student;
import com.exampl.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public List<Student> getStudentDetails() {
		List<Student> studList = new ArrayList<Student>();
		Student stud = new Student();
		stud.setStudId(90);
		stud.setStudName("SAPPY");
		studList.add(stud);
		return studList;
	}

}
