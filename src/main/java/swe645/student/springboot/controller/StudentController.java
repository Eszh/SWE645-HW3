package swe645.student.springboot.controller;
import java.util.List;


import swe645.student.springboot.service.StudentService;
import swe645.student.springboot.model.Student;
import swe645.student.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    StudentService stuService;
	@CrossOrigin(origins = "http://localhost:8080")
	
	@PostMapping("/addstudent")
	public Student addstudent(@RequestBody Student stu) {
	    return stuService.createstudent(stu);
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/students")
	public List<Student> readstudent() {
	    return stuService.getstudents();
	}

	@RequestMapping(value="/student/{sid}", method=RequestMethod.PUT)
	public Student readstudent(@PathVariable(value = "sid") Long sid, @RequestBody Student s) {
	    return stuService.updatestudent(sid, s);
	}

	@RequestMapping(value="/student/{sid}", method=RequestMethod.DELETE)
	public void deletestudent(@PathVariable(value = "sid") Long sid) {
		stuService.deletestudent(sid);
	}
}


