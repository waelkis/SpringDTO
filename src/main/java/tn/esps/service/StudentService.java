package tn.esps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esps.dao.StudentDao;
import tn.esps.entiy.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public List<Student> getStudents(){
		return studentDao.findAll();
		
	}

}
