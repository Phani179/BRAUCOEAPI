package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentsData;

@RestController
public class Controller
{
	@Autowired
	StudentsData studentsData;
	
	@GetMapping("/student/{reg_no}")
	public Optional<Student> getSpecificUser(@PathVariable int reg_no) 
	{
		return studentsData.getStudentData(reg_no);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() 
	{
		return studentsData.students();
	}
}
