package tn.esps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esps.entiy.Course;
import tn.esps.entiy.CourseDTO;
import tn.esps.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/allCourses")
	public List<CourseDTO> getAllCourses(){
		return courseService.getCourses();
	}
	

}
