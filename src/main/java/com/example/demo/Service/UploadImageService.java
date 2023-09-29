package com.example.demo.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.Entity.StudentPersonalInfo;
import com.example.demo.Repo.StudentPersonalInfoRepo;

import net.coobird.thumbnailator.Thumbnails;

@Service
public class UploadImageService 
{
	@Autowired
	StudentPersonalInfoRepo personalInfoRepo;
	
	public String uploadImage(MultipartFile file, Long studentId) throws IOException
	{
		Optional<StudentPersonalInfo> personalInfoObj = personalInfoRepo.findById(studentId);
		StudentPersonalInfo personalInfo = personalInfoObj.get();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Thumbnails.of(file.getInputStream())
                  .size(200, 200)
                  .outputFormat("jpg") // Set the output format (e.g., jpg, png, etc.)
                  .toOutputStream(outputStream);

		try {
			if(personalInfo == null)
			{
				return "failed";
			}
			else {
				personalInfo.setPassportSizePhoto(file.getBytes());
				personalInfoRepo.save(personalInfo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return "Failed";
		}
		return "Success";
	}
}
