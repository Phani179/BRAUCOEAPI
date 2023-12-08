package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Semester_1;
import com.example.demo.Entity.Semester_2;
import com.example.demo.Entity.Semester_3;
import com.example.demo.Entity.Semester_4;
import com.example.demo.Entity.Semester_5;
import com.example.demo.Entity.Semester_6;
import com.example.demo.Repo.Sem1ResultsRepo;
import com.example.demo.Repo.Sem2ResultsRepo;
import com.example.demo.Repo.Sem3ResultsRepo;
import com.example.demo.Repo.Sem4ResultsRepo;
import com.example.demo.Repo.Sem5ResultsRepo;
import com.example.demo.Repo.Sem6ResultsRepo;

@Service
public class ResultsService 
{
	@Autowired
	Sem1ResultsRepo sem1ResultsRepo;
	
	public Semester_1 getSem1Result(Long reg_no)
	{
		Semester_1 sem1Results = sem1ResultsRepo.findById(reg_no).get();
		return sem1Results;
	}
	
	@Autowired
	Sem2ResultsRepo sem2ResultsRepo;
	
	public Semester_2 getSem2Result(Long reg_no)
	{
		Semester_2 sem2Results = sem2ResultsRepo.findById(reg_no).get();
		return sem2Results;
	}
	
	@Autowired
	Sem3ResultsRepo sem3ResultsRepo;
	
	public Semester_3 getSem3Result(Long reg_no)
	{
		Semester_3 sem3Results = sem3ResultsRepo.findById(reg_no).get();
		return sem3Results;
	}
	
	@Autowired
	Sem4ResultsRepo sem4ResultsRepo;
	
	public Semester_4 getSem4Result(Long reg_no)
	{
		Semester_4 sem4Results = sem4ResultsRepo.findById(reg_no).get();
		return sem4Results;
	}
	
	@Autowired
	Sem5ResultsRepo sem5ResultsRepo;
	
	public Semester_5 getSem5Result(Long reg_no)
	{
		Semester_5 sem5Results = sem5ResultsRepo.findById(reg_no).get();
		return sem5Results;
	}
	
	@Autowired
	Sem6ResultsRepo sem6ResultsRepo;
	
	public Semester_6 getSem6Result(Long reg_no)
	{
		Semester_6 sem6Results = sem6ResultsRepo.findById(reg_no).get();
		return sem6Results;
	}
}
