package com.example.demo;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
public class BRAUCOEAPI {
	
	@Autowired
	TwilioConfig twilioConfig;
	
	@PostConstruct
	public void initTwilio()
	{
		Twilio.init(twilioConfig.getAccount_id(), twilioConfig.getAuth_token());
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BRAUCOEAPI.class, args);
	}
	
}





