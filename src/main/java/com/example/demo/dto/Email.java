package com.example.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class Email 
{
	String subject;
	
	String message;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Email [subject=" + subject + ", message=" + message + "]";
	}

	public Email(String subject, String message) {
		super();
		this.subject = subject;
		this.message = message;
	}
	
	public Email()
	{
	}
}
