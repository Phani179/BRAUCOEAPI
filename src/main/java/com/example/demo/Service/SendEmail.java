package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmail 
{
	@Autowired
	JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String from;
	
	public boolean sendEmail(String subject, String message)
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(from);
		simpleMailMessage.setTo("phanireddi7989@gmail.com");
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		javaMailSender.send(simpleMailMessage);
		return true;
	}
}
