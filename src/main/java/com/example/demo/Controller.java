package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.NewPassword;
import com.example.demo.Entity.StudentDetails;
import com.example.demo.Service.GenerateOTP;
import com.example.demo.Service.StudentDetailsService;
import com.example.demo.Service.UpdatePassword;

@RestController
public class Controller
{
	
	@Autowired
	GenerateOTP genarateOtp;
	
	@GetMapping("/getOTP/{mobileNumber}")
	public String generateOTP(@PathVariable String mobileNumber)
	{
		return genarateOtp.generateOTP("+91"+mobileNumber);
	}
	
	@Autowired
	StudentDetailsService studentDetailsService;
	
	@GetMapping("/student/{student_id}")
	public List<Optional<StudentDetails>> getStudent(@PathVariable long student_id)
	{
		return studentDetailsService.getStudent(student_id);
	}
	
	@Autowired
	UpdatePassword updatePasswordObj;
	
	@PutMapping("/updatePassword/{studentId}")
	public boolean updatePassword(@PathVariable long studentId,@RequestBody NewPassword newPassword)
	{
		return updatePasswordObj.updatePassword(studentId, newPassword.getNewPassword());
	}
	
//	@Autowired
//	StudentsData studentsData;
//	
//	@GetMapping("/student/{reg_no}")
//	public List<Optional<Student>> getSpecificUser(@PathVariable int reg_no) 
//	{
//		List<Optional<Student>> student = new ArrayList();
//		student.add(studentsData.getStudentData(reg_no));
//		return student;
//	}
//	
//	@GetMapping("/students")
//	public List<Student> getStudents() 
//	{
//		return studentsData.students();
//	}
	
//	@Autowired
//	ResultData resultData;
//	
//	@GetMapping("/result/Semester - 1/{reg_no}")
//	public Students getResult(@PathVariable long reg_no)
//	{
//		return resultData.getResult(reg_no);
//	}
	
//	@Autowired
//	SendEmail sendEmail;
//	
//	@PostMapping(value = "/sendMail", consumes = MediaType.TEXT_PLAIN_VALUE)
//	public boolean sendMail(@RequestBody Email email) 
//	{
//		return sendEmail.sendEmail(email.getSubject(), email.getMessage());
//	}
	
	
}
