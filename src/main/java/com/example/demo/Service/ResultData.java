package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Results;
import com.example.demo.Entity.Students;
import com.example.demo.Repo.ResultsRepo;
import com.example.demo.Repo.StudentsRepo;

@Service
public class ResultData 
{
	@Autowired
	StudentsRepo studentsRepo;
	
	@Autowired
	ResultsRepo resultsRepo;
	
	public Students getResult(long reg_no)
	{
		Results results = resultsRepo.findById(reg_no).get();
		Students student = studentsRepo.findById(reg_no).get();
		System.out.println(student.getResults());
		System.out.println(results);
		return student;
	}
}
