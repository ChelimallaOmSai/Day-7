package com.codegyan.controlstatements;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 50000;
		int pin = 1234;
		int enteredPin;
		System.out.println("Enter your pin: " );
		enteredPin = sc.nextInt();
		if (enteredPin != pin) {
			System.out.println("Incorrect Pin");
			return;
		}
		int choice ;
		do {
		System.out.println("||=========================================||");
		System.out.println("||=============ATM Menu====================||");
		System.out.println("||=============1. Check Balance ===========||");
		System.out.println("||=============2. Deposit ===================||");
		System.out.println("||=============3. Withdraw ================||");
		System.out.println("||=============4. Exit ====================||");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your balance is: "+balance);
			break;
		case 2:
			System.out.println("Enter Deposit Amount: ");
			double depositAmount = sc.nextDouble();
			if(depositAmount%100!=0) {
				System.out.println("Please Deposit Multiples of 100" + "[100,300,1000]");
			
			}else {
				if(depositAmount<500) {
					System.out.println("Please deposit more than 500 rupees");
				}else {
					balance+=depositAmount;
					System.out.println("Deposited: "+ depositAmount+"succesfully...balance is : "+balance);
				}
			}
			break;
		case 3:
			System.out.println("Enter withdraw Amount: ");
			double withdrawAmount=sc.nextDouble();
			if(withdrawAmount%100!=0) {
				System.out.println("Please Withdraw Multiples of 100" + "[100,300,1000]");
			
			}else {
				if(withdrawAmount<500) {
					System.out.println("Please withdraw more than 500 rupees");
				}else {
					if(withdrawAmount> balance) {
						System.out.println("Insufficient funds");
					}else {
					balance-=withdrawAmount;
					System.out.println("Withdrawn Amount: "+ withdrawAmount+"succesfully...balance is : "+balance);
				}
			}
			
		}
			break;
		case 4:
			System.out.println("Existing... Thankyou for using ATM");
			break;
		default:
			System.out.println("Invaid PIN");
			break;}
		
		}while(choice != 4);
		sc.close();
		
	}
}
