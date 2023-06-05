package com.greatlearning.interfaces;

public class OtpGenerator {
	
	public int generatOTP() {
		int randomPin = (int)((Math.random()*9000)+1000);
		System.out.println(randomPin);
		return randomPin;
	}
}
