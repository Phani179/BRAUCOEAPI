package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "student_qualifications")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentQualifications 
{
	
	@Id
	@Column(name = "Student_Registration_No")
	private Long studentRegNo;
	
	@Column(name = "ADMISSION_NO")
	private Long admissionNo;
	
	@Column(name = "SSC_HALL_TICKET_NO")
	private Long sscHallTicketNo;
	
	@Column(name = "INTERMEDIATE_HALL_TICKET_NO")
	private String interHallTicketNo;
	
	@Column(name = "EAMCET_Hall_Ticket_No")
	private Long eamcetHallTicketNo;
	
	@Column(name = "EAMCET_Rank")
	private Long eamcetRank;

	public Long getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(Long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public Long getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}

	public Long getSscHallTicketNo() {
		return sscHallTicketNo;
	}

	public void setSscHallTicketNo(Long sscHallTicketNo) {
		this.sscHallTicketNo = sscHallTicketNo;
	}

	public String getInterHallTicketNo() {
		return interHallTicketNo;
	}

	public void setInterHallTicketNo(String interHallTicketNo) {
		this.interHallTicketNo = interHallTicketNo;
	}

	public Long getEamcetHallTicketNo() {
		return eamcetHallTicketNo;
	}

	public void setEamcetHallTicketNo(Long eamcetHallTicketNo) {
		this.eamcetHallTicketNo = eamcetHallTicketNo;
	}

	public Long getEamcetRank() {
		return eamcetRank;
	}

	public void setEamcetRank(Long eamcetRank) {
		this.eamcetRank = eamcetRank;
	}
	
}
