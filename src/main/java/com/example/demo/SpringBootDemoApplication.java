package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootDemoApplication {
	
	@Autowired
	TwilioConfig twilioConfig;
	
	@PostConstruct
	public void initTwilio()
	{
		Twilio.init(twilioConfig.getAccount_id(), twilioConfig.getAuth_token());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}





