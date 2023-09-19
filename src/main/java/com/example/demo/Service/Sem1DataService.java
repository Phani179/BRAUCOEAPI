package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Semester_1;
import com.example.demo.Repo.Sem1Repo;

@Service
public class Sem1DataService
{	
	@Autowired
	Sem1Repo sem1Repo;
	
	public Semester_1 getSem1Result(long reg_no)
	{
		Semester_1 sem1Results = sem1Repo.findById(reg_no).get();
		return sem1Results;
	}
}
