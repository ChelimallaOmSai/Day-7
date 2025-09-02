package com.codegyan.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int originalNumber=number;
		int reversednumber=0;
		while(number!=0) {
			int reminder = number%10;
			reversednumber = reversednumber*10+reminder;
			number/=10;
		}
		if(reversednumber<0){
			System.out.println("Reverse of a number "+originalNumber+" is "+reversednumber*-1);
		}else {
			System.out.println("Reverse of a number "+originalNumber+" is "+reversednumber);
		}
		sc.close();
	}

}
