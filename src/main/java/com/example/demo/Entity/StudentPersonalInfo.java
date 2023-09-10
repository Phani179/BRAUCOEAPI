package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "student_personal_info")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentPersonalInfo 
{
	@Id
	@Column(name = "Student_Registration_No")
	long studentRegNo;
	
	@Column(name = "Date_Of_Birth")
	String dateOfBirth;
	
	@Column(name = "Category")
	String category;
	
	@Column(name = "Fee_Reimbursement_Status")
	String feeReimbursementStatus;
	
	@Column(name = "Is_Physical_Handicap")
	String isPhysicalHandicap;
	
	@Column(name = "Permanent_Address")
	String permanentAddress;
	
	@Column(name = "Passport_Size_Photo")
	String passportSizePhoto;
	
	@Column(name = "password")
	String password;
	

	public long getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFeeReimbursementStatus() {
		return feeReimbursementStatus;
	}

	public void setFeeReimbursementStatus(String feeReimbursementStatus) {
		this.feeReimbursementStatus = feeReimbursementStatus;
	}

	public String getIsPhysicalHandicap() {
		return isPhysicalHandicap;
	}

	public void setIsPhysicalHandicap(String isPhysicalHandicap) {
		this.isPhysicalHandicap = isPhysicalHandicap;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPassportSizePhoto() {
		return passportSizePhoto;
	}

	public void setPassportSizePhoto(String passportSizePhoto) {
		this.passportSizePhoto = passportSizePhoto;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
