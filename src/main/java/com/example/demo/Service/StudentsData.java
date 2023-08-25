package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;

@Service
public class StudentsData 
{
	@Autowired
	StudentRepo studentRepo;
	
	public Student getStudentData(long reg_no)
	{
		@SuppressWarnings("deprecation")
		Student student = studentRepo.getById(reg_no);
		if(student == null)
		{
			return null;
		}
		else {
			return student;
		}
	}
	
	public List<Student> students()
	{
		List<Student> students = new ArrayList<Student>();
		students = studentRepo.findAll();
		return students;
	}
}
