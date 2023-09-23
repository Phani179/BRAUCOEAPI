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
	private long studentRegNo;
	
	@Column(name = "ADMISSION_NO")
	private long admissionNo;
	
	@Column(name = "SSC_HALL_TICKET_NO")
	private long sscHallTicketNo;
	
	@Column(name = "INTERMEDIATE_HALL_TICKET_NO")
	private long interHallTicketNo;
	
	@Column(name = "EAMCET_Hall_Ticket_No")
	private long eamcetHallTicketNo;
	
	@Column(name = "EAMCET_Rank")
	private long eamcetRank;

	public long getStudentRegNo() {
		return studentRegNo;
	}

	public void setStudentRegNo(long studentRegNo) {
		this.studentRegNo = studentRegNo;
	}

	public long getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(long admissionNo) {
		this.admissionNo = admissionNo;
	}

	public long getSscHallTicketNo() {
		return sscHallTicketNo;
	}

	public void setSscHallTicketNo(long sscHallTicketNo) {
		this.sscHallTicketNo = sscHallTicketNo;
	}

	public long getInterHallTicketNo() {
		return interHallTicketNo;
	}

	public void setInterHallTicketNo(long interHallTicketNo) {
		this.interHallTicketNo = interHallTicketNo;
	}

	public long getEamcetHallTicketNo() {
		return eamcetHallTicketNo;
	}

	public void setEamcetHallTicketNo(long eamcetHallTicketNo) {
		this.eamcetHallTicketNo = eamcetHallTicketNo;
	}

	public long getEamcetRank() {
		return eamcetRank;
	}

	public void setEamcetRank(long eamcetRank) {
		this.eamcetRank = eamcetRank;
	}
	
}
