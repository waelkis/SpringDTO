package tn.esps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esps.dao.StudentDao;
import tn.esps.entiy.Student;
import tn.esps.entiy.StudentDTO;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public List<StudentDTO> getStudents(){
		List<Student> students = studentDao.findAll();
		List<StudentDTO> studentDTOS = new ArrayList<>();
		for(int i=0; i<students.size();i++) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setId(students.get(i).getId());
			studentDTO.setName(students.get(i).getName());
			
			studentDTOS.add(studentDTO);
			
			
			
			
		}
		return studentDTOS;
		
	}

}
