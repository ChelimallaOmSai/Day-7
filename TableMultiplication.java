package com.codegyan.controlstatements;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Mutliplication table: "+number);
		for(int i=1;i<=20;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
		}
		sc.close();
	}

}
