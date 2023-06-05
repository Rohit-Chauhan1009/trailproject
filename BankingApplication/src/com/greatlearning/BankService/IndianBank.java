package com.greatlearning.BankService;

import java.util.Scanner;

import com.greatlearning.interfaces.InternetBanking;
import com.greatlearning.interfaces.OtpGenerator;

public class IndianBank implements InternetBanking {

	private int amount;
	private int bankBalance = 1000;
	private int otpGenerated;
	private int otp;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount you want to deposit");
		amount = sc.nextInt();
		
		if(amount>0) {
			bankBalance += amount;
			System.out.println("Amount Rs."+amount+" Deposited Successfully");
			System.out.println("Update bank balance is: Rs."+bankBalance);
		}else {
			System.out.println("Enter a valid amount!");
		}
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		if (bankBalance>1000) {
			System.out.println("Enter the amount you want to withdraw");
			int withdraw = sc.nextInt();
			
			bankBalance = bankBalance - withdraw;
			System.out.println("The remaining Balance is: Rs."+bankBalance);
		}
		else {
			System.out.println("can't withdraw");
		}
	}

	@Override
	public int checkBalance() {

		System.out.println("The bank Balance is Rs."+ bankBalance);
		return bankBalance;
	}

	@Override
	public boolean transfer() {
		OtpGenerator otpGenerate = new OtpGenerator();
		System.out.println("Enter the OTP");
		
		otpGenerated = otpGenerate.generatOTP();
		
//		System.out.println(otpGenerated);
		otp=sc.nextInt();
		
		if(otp==otpGenerated) {
			System.out.println("Otp verfication successfull !!!!");
			
			//a) Ask the amount that customer wants to transfer
			System.out.println("Enter the amount you want to transfer");
			
			amount = sc.nextInt();
			System.out.println("Enter the Bank Account number to which you want to transfer");
			int bankAccountNo = sc.nextInt();
			
			if(bankBalance - amount>0) {

				System.out.println("amount Rs."+amount+ "transfer successful to this Bank Account "+ bankAccountNo);
				
				bankBalance = bankBalance - amount;
				System.out.println("Remaining Bank balance is Rs."+bankBalance);
				
				return true;
			}
			else {
				System.out.println("Insufficient Bank balance");
				return false;
			}
		}
		else {
			System.out.println("Invalid OTP");
			return false;
		}
	}

}
