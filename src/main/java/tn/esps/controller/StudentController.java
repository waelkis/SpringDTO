package tn.esps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esps.entiy.Student;
import tn.esps.service.StudentService;

@RestController("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	
	@RequestMapping("/allStudents")
	public List<Student> getAllStudents() {
		return studentService.getStudents();
	}

}
