package tn.esps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.esps.entiy.Student;
import tn.esps.entiy.StudentDTO;
import tn.esps.entiy.StudentPositionDto;
import tn.esps.entiy.StudentRes;
import tn.esps.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	
	@GetMapping("/allStudents")
	public List<StudentDTO> getAllStudents() {
		return studentService.getStudents();
	}
	
	//http://localhost:8081/student/getStudent?id_stident=1
	@GetMapping("/getStudents")
	public StudentRes getStudent(@RequestParam("id_stident") Long id) {
		return studentService.getStudent(id);
	}
	@GetMapping("/allStudentsR")
	public List<Student> getAllStudentsAferR() {
		return studentService.getStudentsAfterR();
	}
	
	@GetMapping("/student_course")
	public StudentPositionDto  getStudentourse(@RequestParam("course_id_list") List<Long>  ids) {
		return studentService.getStudentourse(ids);
	}

}
