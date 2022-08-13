package tn.esps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esps.dao.CourseDao;
import tn.esps.entiy.Course;
import tn.esps.entiy.CourseDTO;

@Service
public class CourseService {
	@Autowired
	private CourseDao courseDao;
	
	public List<CourseDTO> getCourses(){
		List<Course> courses= courseDao.findAll();
		List<CourseDTO> courseDTOS =new ArrayList<>();
		for(int i =0;i<courses.size();i++) {
			CourseDTO courseDTO = new CourseDTO();
			
			courseDTO.setId(courses.get(i).getId());
			courseDTO.setName(courses.get(i).getName());
			courseDTO.setCost(courses.get(i).getCost());
			
			courseDTOS.add(courseDTO);
			
		}
		return courseDTOS;
		
	
		
	}
		public List<Course> getCoursesAfterRelation(){
		return courseDao.findAll();
		}

}
