package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "fees_details")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fees 
{
	@Id
	@Column(name = "student_registration_no")
	private long student_id;
	
	private String year_1;
	
	private String year_2;
	
	private String year_3;
	
	private String year_4;
	
	public String getYear1()
	{
		return year_1;
	}
	
	public String getYear2()
	{
		return year_2;
	}
	
	public String getYear3()
	{
		return year_3;
	}
	
	public String getYear4()
	{
		return year_4;
	}
	
	public void setYear1(String year_1)
	{
		this.year_1 = year_1;
	}
	
	public void setYear2(String year_2)
	{
		this.year_2 = year_2;
	}
	
	public void setYear3(String year_3)
	{
		this.year_3 = year_3;
	}
	
	public void setYear4(String year_4)
	{
		this.year_4 = year_4;
	}
}
