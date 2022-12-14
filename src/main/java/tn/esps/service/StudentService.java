package tn.esps.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esps.dao.CourseDao;
import tn.esps.dao.StudentDao;
import tn.esps.entiy.Student;
import tn.esps.entiy.StudentDTO;
import tn.esps.entiy.StudentPositionDto;
import tn.esps.entiy.StudentRes;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CourseDao courseDao;

	public List<StudentDTO> getStudents() {
		List<Student> students = studentDao.findAll();
		List<StudentDTO> studentDTOS = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			StudentDTO studentDTO = modelMapper.map(students.get(i), StudentDTO.class );

			/*studentDTO.setId(students.get(i).getId());
			studentDTO.setName(students.get(i).getName());*/

			studentDTOS.add(studentDTO);

		}
		return studentDTOS;

	}

	public StudentRes getStudent(Long id) {

		Student student = studentDao.findById(id).get();

		StudentRes studentRes = new StudentRes();
		studentRes.setPhone("52708318");
		//studentRes=modelMapper.map(student, StudentRes.class);
		modelMapper.map(student, studentRes);

	

		return studentRes;

	}
	public List<Student> getStudentsAfterR() {
		return studentDao.findAll();
	}

	public StudentPositionDto getStudentourse(List<Long> ids) {
		
		
		StudentPositionDto studentPositionDto = new StudentPositionDto();
		 Student student =  courseDao.findStudentByCourseID(ids.get(0));
		 
		 studentPositionDto.setId(student.getId());
		 studentPositionDto.setName(student.getName());
		 
		 return studentPositionDto;
	}


}
