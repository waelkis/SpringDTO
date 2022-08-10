package tn.esps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entiy.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>  {

}
