package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "student_details")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDetails 
{
	@Id
	@Column(name = "STUDENT_REGISTRATION_NO")
	long studentRegNo;
	
	@Column(name = "STUDENT_NAME")
	String student_name;
	
	@Column(name = "FATHER_NAME")
	String father_name;
	
	@Column(name = "GENDER")
	String gender;
	
	@Column(name = "E_mail_ID")
	String email_id;
	
	@Column(name = "NAME_OF_THE_BRANCH")
	String branch;
	
	@Column(name = "Student_Mobile_No")
	String mobile_no;
	
	@Column(name = "DATE_OF_WILLINGNESS")
	String dateOfWillingness;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	StudentPersonalInfo studentPersonalInfo;

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDateOfWillingness() {
		return dateOfWillingness;
	}

	public void setDateOfWillingness(String dateOfWillingness) {
		this.dateOfWillingness = dateOfWillingness;
	}

	public StudentPersonalInfo getStudentPersonalInfo() {
		return studentPersonalInfo;
	}

	public void setStudentPersonalInfo(StudentPersonalInfo studentPersonalInfo) {
		this.studentPersonalInfo = studentPersonalInfo;
	}
	
	
}
