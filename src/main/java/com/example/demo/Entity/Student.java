package com.example.demo.Entity;

public class Student 
{
	int reg_no;
	String name;
	String password;
	
	public Student(int reg_no, String name, String password)
	{
		this.reg_no = reg_no;
		this.name = name;
		this.password = password;
	}
	
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
