package com.codegyan.controlstatements;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountBalance = 50000.0;
		System.out.println("Enter the amount: ");
		double withdrawAmount = scanner.nextDouble();
		if(withdrawAmount<=accountBalance && withdrawAmount%100==0) {
			accountBalance -= withdrawAmount;
			System.out.println("withdraw Amount: "+ withdrawAmount+ " Available balance is: "+accountBalance);
			
		}else {
			System.out.println("Insufficient Funds");
		}
		scanner.close();
	}

}
