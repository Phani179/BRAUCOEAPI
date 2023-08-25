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
	public List<Student> getStudentData()
	{
		List<Student> students =new ArrayList<>();
		students.add(new Student(2081951044, "Phani", "Phani@7989"));
		students.add(new Student(2081951034, "Sai", "Sai@1234"));
		students.add(new Student(2081951014, "Kumar", "Kumar@1234"));
		return students;
	}
	
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> students()
	{
		List<Student> students = new ArrayList<Student>();
		students = studentRepo.findAll();
		return students;
	}
}
