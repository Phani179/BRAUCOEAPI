package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Repo.StudentDetailsRepo;

@Service
public class StudentDetailsService 
{
	@Autowired
	StudentDetailsRepo studentDetailsRepo;
	
	public List<Optional<StudentDetails>> getStudent(long student_id)
	{
		Optional<StudentDetails> student = studentDetailsRepo.findById(student_id);
		List<Optional<StudentDetails>> studentDetails = new ArrayList<>();
		studentDetails.add(student);
		return studentDetails;
	}
}
