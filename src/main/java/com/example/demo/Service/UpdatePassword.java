package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentPersonalInfo;
import com.example.demo.Repo.StudentPersonalInfoRepo;

@Service
public class UpdatePassword 
{
	
	@Autowired
	StudentPersonalInfoRepo studentPersonalInfoRepo;
	
	public boolean updatePassword(long studentId,String newPassword)
	{
		Optional<StudentPersonalInfo> student = studentPersonalInfoRepo.findById(studentId);
		System.out.println(student.get());
		if(!student.isEmpty())
		{
			StudentPersonalInfo studentPersonalInfo = student.get();
			studentPersonalInfo.setPassword(newPassword);
			studentPersonalInfoRepo.save(studentPersonalInfo);
			return true;
		}
		return false;
	}
}
