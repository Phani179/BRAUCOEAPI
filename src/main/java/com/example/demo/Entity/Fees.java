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
	
	private long year_1;
	
	private long year_2;
	
	private long year_3;
	
	private long year_4;
	
	public long getYear1()
	{
		return year_1;
	}
	
	public long getYear2()
	{
		return year_2;
	}
	
	public long getYear3()
	{
		return year_3;
	}
	
	public long getYear4()
	{
		return year_4;
	}
	
	public void setYear1(long year_1)
	{
		this.year_1 = year_1;
	}
	
	public void setYear2(long year_2)
	{
		this.year_2 = year_2;
	}
	
	public void setYear3(long year_3)
	{
		this.year_3 = year_3;
	}
	
	public void setYear4(long year_4)
	{
		this.year_4 = year_4;
	}
}
