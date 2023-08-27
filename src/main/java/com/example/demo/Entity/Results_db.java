package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "results_db")
@IdClass(ResultsPrimaryKey.class)
public class Results_db
{
	@Id
	long reg_no;
	@Id
	String subject;
	String name;
	String branch;
	float grade_points;
	public long getReg_no() {
		return reg_no;
	}
	public void setReg_no(long reg_no) {
		this.reg_no = reg_no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getGrade_points() {
		return grade_points;
	}
	public void setGrade_points(float grade_points) {
		this.grade_points = grade_points;
	}
	public Results_db(long reg_no, String subject, String name, String branch, float grade_points) {
		super();
		this.reg_no = reg_no;
		this.subject = subject;
		this.name = name;
		this.branch = branch;
		this.grade_points = grade_points;
	}
	@Override
	public String toString() {
		return "Results_db [reg_no=" + reg_no + ", subject=" + subject + ", name=" + name + ", branch=" + branch
				+ ", grade_points=" + grade_points + "]";
	}
	public Results_db() {}
}
