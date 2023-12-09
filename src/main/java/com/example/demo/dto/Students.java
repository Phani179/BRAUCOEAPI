package com.example.demo.dto;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
public class Students
{
	
	Long studentRegNo;
	
	String studentName;
	
	String mobileNo;
	
	Long admissionNo;

	public Long getStudentRegNo() {
		return studentRegNo;
	}

	public Long getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}

	public void setStudentRegNo(Long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public Students()
	{
		
	}
	
	public Students(Long studentRegNo, String studentName, String mobileNo, Long admissionNo)
	{
		this.studentRegNo = studentRegNo;
		this.studentName = studentName;
		this.mobileNo = mobileNo;
		this.admissionNo = admissionNo;
	}

	@Override
	public String toString() {
		return "Students [studentRegNo=" + studentRegNo + ", studentName=" + studentName + ", mobileNo=" + mobileNo
				+ ", admissionNo=" + admissionNo + "]";
	}
	
}
