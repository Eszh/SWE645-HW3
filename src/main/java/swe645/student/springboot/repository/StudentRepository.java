package swe645.student.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swe645.student.springboot.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
