package tn.esps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.esps.entiy.Course;
import tn.esps.entiy.Student;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>  {
	
	@Query("select c.student from course c where c.id = ?1")
	
	public Student findStudentByCourseID(Long id);
	

}
