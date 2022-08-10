package tn.esps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esps.entiy.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
