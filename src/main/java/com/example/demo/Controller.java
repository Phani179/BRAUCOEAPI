package com.example.demo;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.Fees;
import com.example.demo.Entity.NewPassword;
import com.example.demo.Entity.Semester_1;
import com.example.demo.Entity.Semester_2;
import com.example.demo.Entity.Semester_3;
import com.example.demo.Entity.Semester_4;
import com.example.demo.Entity.Semester_5;
import com.example.demo.Entity.Semester_6;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Service.OTPService;
import com.example.demo.Service.ResultsService;
import com.example.demo.Service.EmailService;
import com.example.demo.Service.FeeDeatilsService;
import com.example.demo.Service.StudentDetailsService;
import com.example.demo.Service.UpdatePasswordService;
import com.example.demo.Service.UploadImageService;
import com.example.demo.dto.Email;
import com.example.demo.dto.Students;
//import com.example.demo.dto.Students;

@RestController
public class Controller
{
	@Autowired
	OTPService genarateOtp;
	
	@GetMapping("/getOTP/{mobileNumber}")
	public String generateOTP(@PathVariable String mobileNumber)
	{
		return genarateOtp.generateOTP("+91"+mobileNumber);
	}
	
	@Autowired(required = true)
	StudentDetailsService studentDetailsService;
	
	@GetMapping("/student/{student_id}")
	public List<Optional<StudentDetails>> getStudent(@PathVariable long student_id)
	{
		System.out.println(studentDetailsService.getStudent(student_id).get(0).get());
		return studentDetailsService.getStudent(student_id);
	}
	
	@GetMapping("/getAllStudents")
	public List<Students> getAllStudents()
	{
		return studentDetailsService.getAllStudents();
	}
	
	@Autowired
	UpdatePasswordService updatePasswordObj;
	
	@PutMapping("/updatePassword/{studentId}")
	public boolean updatePassword(@PathVariable long studentId,@RequestBody NewPassword newPassword)
	{
		System.out.println(studentId);
		return updatePasswordObj.updatePassword(studentId, newPassword.getNewPassword());
	}
	
	@Autowired
	UploadImageService imageService;
	
	@PostMapping("/updateProfileDp/{studentId}")
	public String uploadImage(@RequestParam("image") MultipartFile multipartFile, @PathVariable Long studentId) throws IOException
	{
		return imageService.uploadImage(multipartFile, studentId);
	}
	

	@Autowired
	EmailService sendEmail;
	
	@PostMapping(value = "/sendMail")
	public boolean sendMail(@RequestBody Email email) 
	{
		return sendEmail.sendEmail(email.getSubject(), email.getMessage());
	}
	
	@Autowired
	ResultsService resultsService;
	
	@GetMapping("/result/semester_1/{reg_no}")
	public Semester_1 getSem1Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem1Result(reg_no);
	}
	
	@GetMapping("/result/semester_2/{reg_no}")
	public Semester_2 getSem2Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem2Result(reg_no);
	}
	
	@GetMapping("/result/semester_3/{reg_no}")
	public Semester_3 getSem3Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem3Result(reg_no);
	}
	
	@GetMapping("/result/semester_4/{reg_no}")
	public Semester_4 getSem4Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem4Result(reg_no);
	}
	
	@GetMapping("/result/semester_5/{reg_no}")
	public Semester_5 getSem5Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem5Result(reg_no);
	}
	
	@GetMapping("/result/semester_6/{reg_no}")
	public Semester_6 getSem6Results(@PathVariable Long reg_no)
	{
		return resultsService.getSem6Result(reg_no);
	}
	
	@GetMapping("/result/semester_7/{reg_no}")
	public String getSem7Results(@PathVariable Long reg_no)
	{
		return null;
	}
	
	@GetMapping("/result/semester_8/{reg_no}")
	public String getSem8Results(@PathVariable Long reg_no)
	{
		return null;
	}
	
	@Autowired
	FeeDeatilsService feeDeatilsService;
	
	@GetMapping("/fee-details/{reg_no}")
	public Fees getFeeResults(@PathVariable Long reg_no)
	{
			return feeDeatilsService.getStudentFeesDetails(reg_no);
	}
}
