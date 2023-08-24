package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentsData;

@RestController
public class Controller
{
	@Autowired
	StudentsData studentsData;
	
	@GetMapping("/studentsdata")
	public List<Student> getUser() {
		return studentsData.getStudentData();
	}
	
	@GetMapping("/get-student/{reg_no}")
	public Student getSpecificUser(@PathVariable int reg_no) 
	{
		List<Student> students = studentsData.getStudentData();
		for(Student i : students)
		{
			if(reg_no == i.getReg_no())
			{
				return i;
			}
		}
		return null;
	}
}
