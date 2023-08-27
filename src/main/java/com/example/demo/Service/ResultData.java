package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Results_db;
import com.example.demo.Repo.ResultsRepo;

@Service
public class ResultData 
{
	@Autowired
	ResultsRepo results;
	
	public List<Results_db> getResults(long reg_no)
	{
		List<Results_db> result = new ArrayList<>();
		System.out.println("Service Called");
		result = results.findByRegNo(reg_no);
		System.out.println(result);
		return result;
	}
}
