package com.example.demo.Service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.Entity.StudentPersonalInfo;
import com.example.demo.Repo.StudentPersonalInfoRepo;

@Service
public class UploadImageService 
{
	@Autowired
	StudentPersonalInfoRepo personalInfoRepo;
	
	public String uploadImage(MultipartFile file, Long studentId)
	{
		Optional<StudentPersonalInfo> personalInfoObj = personalInfoRepo.findById(studentId);
		StudentPersonalInfo personalInfo = personalInfoObj.get();
		try {
			personalInfo.setPassportSizePhoto(file.getBytes());
			personalInfoRepo.save(personalInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "Failed";
		}
		return "Success";
	}
}
