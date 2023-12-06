package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Fees;
import com.example.demo.Repo.FeeDetailsRepo;

@Service
public class FeeDeatilsService 
{
	@Autowired
	FeeDetailsRepo feeDetailsRepo;
	
	public Fees getStudentFeesDetails(Long id)
	{
			Fees fees = feeDetailsRepo.findById(id).get();
			return fees;
	}
}
