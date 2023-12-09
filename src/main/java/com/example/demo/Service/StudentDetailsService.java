package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Repo.StudentDetailsRepo;
//import com.example.demo.dto.Students;
import com.example.demo.dto.Students;

@Service
public class StudentDetailsService 
{
	@org.springframework.beans.factory.annotation.Autowired(required=true)
	StudentDetailsRepo studentDetailsRepo;
	
	public List<Optional<StudentDetails>> getStudent(long student_id)
	{
		Optional<StudentDetails> student = studentDetailsRepo.findById(student_id);
		List<Optional<StudentDetails>> studentDetails = new ArrayList<>();
		studentDetails.add(student);
		return studentDetails;
	}
	
	public List<Students> getAllStudents()
	{
		List<StudentDetails> studentsDetails = studentDetailsRepo.findAll();
		ArrayList<Students> students = new ArrayList<Students>();
		for(int i = 0; i < studentsDetails.size(); i++)
		{
			Students student = new Students(studentsDetails.get(i).getStudentRegNo(), 
					studentsDetails.get(i).getStudent_name(), 
					studentsDetails.get(i).getMobile_no(), 
					studentsDetails.get(i).getStudentQualifications().getAdmissionNo());
			students.add(student);
			
		}
		return students;
	}
}
