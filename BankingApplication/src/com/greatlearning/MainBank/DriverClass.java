package com.greatlearning.MainBank;

import java.util.Scanner;

import com.greatlearning.BankService.IndianBank;
import com.greatlearning.interfaces.InternetBanking;
import com.greatlearning.model.Customer;

public class DriverClass {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String bankAccountNumber;
		String password;

		// create a customer object

		Customer cs = new Customer("Cust1234", "pass@123");

		System.out.println("Welcome to login page: ");
		System.out.println(" ");
		System.out.println("Enter bank Account Number ");

		bankAccountNumber = s.nextLine();

		System.out.println("Enter the password");
		password = s.nextLine();
		
		boolean isValid = validateCredentials(bankAccountNumber, password, cs);
		
		if(isValid) {
			process(s);
		}
	}

	private static boolean validateCredentials(String bankAccountNumber, String password, Customer customer) {
		boolean returnValue = false;
		if (customer.getBankAccountNumber().equals(bankAccountNumber) && customer.getPassword().equals(password)) {
			System.out.println("Welcome to Indian Bank!");
			returnValue = true;
		}
		return returnValue;
	}

	private static void process(Scanner s) {
		int Option;
		InternetBanking banking = new IndianBank();
		
		do {
		
			System.out.println("_________________________________");
			System.out.println("Enter the operation number that you want to perform: ");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. withdrawal");
			System.out.println("4. Transfer");
			System.out.println("0. Logout");
			System.out.println("_________________________________");
			
			Option = s.nextInt();
			
			switch(Option) {
			
				case 0:
					Option = 0;
					break;
				case 1:
					Option = 1;
					banking.checkBalance();
					break;
				case 2:
					Option = 2;
					banking.deposit();
					break;
				case 3:
					Option = 3;
					banking.withdrawal();
					break;
				case 4:
					Option = 4;
					banking.transfer();
					break;
					
			}
			
		}while(Option != 0); {
			System.out.println("Enter the operation number that you want to perform: ");
		}
		
	}

}
