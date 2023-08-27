package com.example.demo.Entity;

public class ResultsPrimaryKey 
{
	long reg_no;
	
	String subject;

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

	public ResultsPrimaryKey(long reg_no, String subject) {
		super();
		this.reg_no = reg_no;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ResultsPrimaryKey [reg_no=" + reg_no + ", subject=" + subject + "]";
	}
	
	public ResultsPrimaryKey() {}
}
