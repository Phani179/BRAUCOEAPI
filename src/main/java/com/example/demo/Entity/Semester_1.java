package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "semester_1")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Semester_1 
{
	@Id
	@Column(name = "Registration_no")
	private long student_id;
	
	private int pap1c;
	private String pap1n;
	private float pap1gr;
		
	private int pap2c;
	private String pap2n;
	private float pap2gr;

	private int pap3c;
	private String pap3n;
	private float pap3gr;

	private int pap4c;
	private String pap4n;
	private float pap4gr;
	
	private int pap5c;
	private String pap5n;
	private float pap5gr;
	
	private int pap6c;
	private String pap6n;
	private float pap6gr;

	public int getPap6c() {
		return pap6c;
	}
	public void setPap6c(int pap6c) {
		this.pap6c = pap6c;
	}
	public String getPap6n() {
		return pap6n;
	}
	public void setPap6n(String pap6n) {
		this.pap6n = pap6n;
	}
	public float getPap6gr() {
		return pap6gr;
	}
	public void setPap6gr(float pap6gr) {
		this.pap6gr = pap6gr;
	}
	
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public int getPap1c() {
		return pap1c;
	}
	public void setPap1c(int pap1c) {
		this.pap1c = pap1c;
	}
	public String getPap1n() {
		return pap1n;
	}
	public void setPap1n(String pap1n) {
		this.pap1n = pap1n;
	}
	public float getPap1gr() {
		return pap1gr;
	}
	public void setPap1gr(float pap1gr) {
		this.pap1gr = pap1gr;
	}
	public int getPap2c() {
		return pap2c;
	}
	public void setPap2c(int pap2c) {
		this.pap2c = pap2c;
	}
	public String getPap2n() {
		return pap2n;
	}
	public void setPap2n(String pap2n) {
		this.pap2n = pap2n;
	}
	public float getPap2gr() {
		return pap2gr;
	}
	public void setPap2gr(float pap2gr) {
		this.pap2gr = pap2gr;
	}
	public int getPap3c() {
		return pap3c;
	}
	public void setPap3c(int pap3c) {
		this.pap3c = pap3c;
	}
	public String getPap3n() {
		return pap3n;
	}
	public void setPap3n(String pap3n) {
		this.pap3n = pap3n;
	}
	public float getPap3gr() {
		return pap3gr;
	}
	public void setPap3gr(float pap3gr) {
		this.pap3gr = pap3gr;
	}
	public int getPap4c() {
		return pap4c;
	}
	public void setPap4c(int pap4c) {
		this.pap4c = pap4c;
	}
	public String getPap4n() {
		return pap4n;
	}
	public void setPap4n(String pap4n) {
		this.pap4n = pap4n;
	}
	public float getPap4gr() {
		return pap4gr;
	}
	public void setPap4gr(float pap4gr) {
		this.pap4gr = pap4gr;
	}
	public int getPap5c() {
		return pap5c;
	}
	public void setPap5c(int pap5c) {
		this.pap5c = pap5c;
	}
	public String getPap5n() {
		return pap5n;
	}
	public void setPap5n(String pap5n) {
		this.pap5n = pap5n;
	}
	public float getPap5gr() {
		return pap5gr;
	}
	public void setPap5gr(float pap5gr) {
		this.pap5gr = pap5gr;
	}
}
