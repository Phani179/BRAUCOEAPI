package com.example.demo.Entity;

import org.springframework.stereotype.Component;

@Component
public class NewPassword 
{
	String newPassword;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public NewPassword(String newPassword) {
		super();
		this.newPassword = newPassword;
	}

	public NewPassword() {
		super();
	}
	
}
