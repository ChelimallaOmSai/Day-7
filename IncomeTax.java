package com.codegyan.controlstatements;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the income: ");
		int income = scanner.nextInt();
		if(income<300000) {
			double incometax = income * 0.05;
			System.out.println("Income tax: "+ incometax);
		}else {
			if(income>300000 && income<1000000) {
				double incometax = income * 0.1;
				System.out.println("Income tax: "+ incometax);
			}else {
				if(income>1000000) {
					double incometax = income * 0.15;
					System.out.println("Income tax: "+ incometax);
				}else {
					double incometax = income * 0.15;
					double incometax2 = incometax + incometax*0.01;
					System.out.println("Income tax: "+ incometax2);
				}
			}
		}
		scanner.close();
	}

}
