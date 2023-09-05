package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Students
{
	@Id
	long student_id;
	
	String student_name;
	
	String branch;
	
	@OneToOne(mappedBy = "student")
	Results result;

	public Results getResults() {
		return result;
	}

	public void setResults(Results result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Students [student_id=" + student_id + ", student_name=" + student_name + ", branch=" + branch
				+ ", results=" + result + "]";
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
