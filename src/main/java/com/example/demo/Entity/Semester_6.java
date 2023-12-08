package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "semester_5")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Semester_6 
{
	@Id
	@Column(name = "Registration_no")
	private long student_id;
	
    private float sgpa;
    private String pap1n;
    private String pap1gr;
    private float pap1grp;
    
    private String pap2n;
    private String pap2gr;
    private float pap2grp;
    
    private String pap3n;
    private String pap3gr;
    private float pap3grp;
    
    private String pap4n;
    private String pap4gr;
    private float pap4grp;
    
    private String pap5n;
    private String pap5gr;
    private float pap5grp;
    
    private String pap6n;
    private String pap6gr;
    private float pap6grp;
    
    private String pap7n;
    private String pap7gr;
    private float pap7grp;
    
    private String pap8n;
    private String pap8gr;
    private float pap8grp;
    
  
	public String getPap7n() {
		return pap7n;
	}
	public void setPap7n(String pap7n) {
		this.pap7n = pap7n;
	}
	public String getPap7gr() {
		return pap7gr;
	}
	public void setPap7gr(String pap7gr) {
		this.pap7gr = pap7gr;
	}
	public float getPap7grp() {
		return pap7grp;
	}
	public void setPap7grp(float pap7grp) {
		this.pap7grp = pap7grp;
	}
	public String getPap8n() {
		return pap8n;
	}
	public void setPap8n(String pap8n) {
		this.pap8n = pap8n;
	}
	public String getPap8gr() {
		return pap8gr;
	}
	public void setPap8gr(String pap8gr) {
		this.pap8gr = pap8gr;
	}
	public float getPap8grp() {
		return pap8grp;
	}
	public void setPap8grp(float pap8grp) {
		this.pap8grp = pap8grp;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public float getSgpa() {
		return sgpa;
	}
	public void setSgpa(float sgpa) {
		this.sgpa = sgpa;
	}
	public String getPap1n() {
		return pap1n;
	}
	public void setPap1n(String pap1n) {
		this.pap1n = pap1n;
	}
	public String getPap1gr() {
		return pap1gr;
	}
	public void setPap1gr(String pap1gr) {
		this.pap1gr = pap1gr;
	}
	public float getPap1grp() {
		return pap1grp;
	}
	public void setPap1grp(float pap1grp) {
		this.pap1grp = pap1grp;
	}
	public String getPap2n() {
		return pap2n;
	}
	public void setPap2n(String pap2n) {
		this.pap2n = pap2n;
	}
	public String getPap2gr() {
		return pap2gr;
	}
	public void setPap2gr(String pap2gr) {
		this.pap2gr = pap2gr;
	}
	public float getPap2grp() {
		return pap2grp;
	}
	public void setPap2grp(float pap2grp) {
		this.pap2grp = pap2grp;
	}
	public String getPap3n() {
		return pap3n;
	}
	public void setPap3n(String pap3n) {
		this.pap3n = pap3n;
	}
	public String getPap3gr() {
		return pap3gr;
	}
	public void setPap3gr(String pap3gr) {
		this.pap3gr = pap3gr;
	}
	public float getPap3grp() {
		return pap3grp;
	}
	public void setPap3grp(float pap3grp) {
		this.pap3grp = pap3grp;
	}
	public String getPap4n() {
		return pap4n;
	}
	public void setPap4n(String pap4n) {
		this.pap4n = pap4n;
	}
	public String getPap4gr() {
		return pap4gr;
	}
	public void setPap4gr(String pap4gr) {
		this.pap4gr = pap4gr;
	}
	public float getPap4grp() {
		return pap4grp;
	}
	public void setPap4grp(float pap4grp) {
		this.pap4grp = pap4grp;
	}
	public String getPap5n() {
		return pap5n;
	}
	public void setPap5n(String pap5n) {
		this.pap5n = pap5n;
	}
	public String getPap5gr() {
		return pap5gr;
	}
	public void setPap5gr(String pap5gr) {
		this.pap5gr = pap5gr;
	}
	public float getPap5grp() {
		return pap5grp;
	}
	public void setPap5grp(float pap5grp) {
		this.pap5grp = pap5grp;
	}
	public String getPap6n() {
		return pap6n;
	}
	public void setPap6n(String pap6n) {
		this.pap6n = pap6n;
	}
	public String getPap6gr() {
		return pap6gr;
	}
	public void setPap6gr(String pap6gr) {
		this.pap6gr = pap6gr;
	}
	public float getPap6grp() {
		return pap6grp;
	}
	public void setPap6grp(float pap6grp) {
		this.pap6grp = pap6grp;
	}
}
