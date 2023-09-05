package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig 
{
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public String getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}
	public String getTrail_number() {
		return trail_number;
	}
	public void setTrail_number(String trail_number) {
		this.trail_number = trail_number;
	}
	String account_id;
	String auth_token;
	String trail_number;
}
