package com.example.demo.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Results 
{
	@Id
	long student_id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	Students student;
	
	int pap1c;
	String pap1n;
	float pap1gr;
		
	int pap2c;
	String pap2n;
	float pap2gr;

	int pap3c;
	String pap3n;
	float pap3gr;

	int pap4c;
	String pap4n;
	float pap4gr;

	public String getPap1n() {
		return pap1n;
	}

	public void setPap1n(String pap1n) {
		this.pap1n = pap1n;
	}

	public String getPap2n() {
		return pap2n;
	}

	public void setPap2n(String pap2n) {
		this.pap2n = pap2n;
	}

	public String getPap3n() {
		return pap3n;
	}

	public void setPap3n(String pap3n) {
		this.pap3n = pap3n;
	}

	public String getPap4n() {
		return pap4n;
	}

	public void setPap4n(String pap4n) {
		this.pap4n = pap4n;
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

	public float getPap4gr() {
		return pap4gr;
	}

	public void setPap4gr(float pap4gr) {
		this.pap4gr = pap4gr;
	}

	@Override
	public String toString() {
		return "Results [reg_no=" + student_id + ", pap1c=" + pap1c + ", pap1n=" + pap1n + ", pap1gr=" + pap1gr + ", pap2c="
				+ pap2c + ", pap2n=" + pap2n + ", pap2gr=" + pap2gr + ", pap3c=" + pap3c + ", pap3n=" + pap3n
				+ ", pap3gr=" + pap3gr + ", pap4c=" + pap4c + ", pap4n=" + pap4n + ", pap4gr=" + pap4gr + "]";
	}
	
	
}
