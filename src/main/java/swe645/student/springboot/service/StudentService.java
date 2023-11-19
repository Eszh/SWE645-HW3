package swe645.student.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import swe645.student.springboot.model.Student;
import swe645.student.springboot.repository.StudentRepository;
import java.util.List;

@Service
public class StudentService {

	@Autowired
	StudentRepository sturepository;
	
	
	// CREATE 
	public Student createstudent(Student s) {
	    return sturepository.save(s);
	}

	// READ
	public List<Student> getstudents() {
	    return sturepository.findAll();
	}
	// DELETE
	public void deletestudent(Long sid) {
		sturepository.deleteById(sid);
	}
	
	// UPDATE
	public Student updatestudent(Long sid, Student s) {
	        Student stu = sturepository.findById(sid).get();
	        stu.setFirstName(s.getFirstName());
	        stu.setLastName(s.getLastName());
	        return sturepository.save(stu);                                
	}


}



