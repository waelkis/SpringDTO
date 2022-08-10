package tn.esps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esps.dao.CourseDao;
import tn.esps.entiy.Course;

@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
	
	public List<Course> getCourses(){
		return courseDao.findAll();
	}
	

}
