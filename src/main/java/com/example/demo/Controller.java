package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.StudentReg_No;
import com.example.demo.Service.StudentsData;

@RestController
public class Controller
{
	@Autowired
	StudentsData studentsData;
	
	@GetMapping("/student/{reg_no}")
	public List<Optional<Student>> getSpecificUser(@PathVariable int reg_no) 
	{
		List<Optional<Student>> student = new ArrayList();
		student.add(studentsData.getStudentData(reg_no));
		return student;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() 
	{
		return studentsData.students();
	}
}
