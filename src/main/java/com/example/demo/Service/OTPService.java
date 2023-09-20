package com.example.demo.Service;

import java.text.DecimalFormat;
import java.util.Random;import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class OTPService 
{
	@Autowired
	TwilioConfig twilioConfig;
	
	public String generateOTP(String to)
	{
		PhoneNumber toNumber = new PhoneNumber(to);
		PhoneNumber fromNumber = new PhoneNumber(twilioConfig.getTrail_number());
		String otp = otp();
		Message message = Message.creator(
               toNumber, fromNumber,
                "Your OTP :"+otp)
            .create();
		return otp;
	}
	
	public String otp()
	{
		return new DecimalFormat("0000").format(new Random().nextInt(9999));
	}
}
