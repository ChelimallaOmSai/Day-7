package com.codegyan.controlstatements;

import java.util.Scanner;

public class Wishes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter city name: ");
		String city = scanner.next();
		if(city.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi");
			
		}else {
			if(city.equalsIgnoreCase("banglore")) {
				System.out.println("Hello kannadiga");
			}else {
				if(city.equalsIgnoreCase("chennai")) {
					System.out.println("Hello madrasi");
				}else {
					System.out.println("Enter valid city name");
				}
			}
		}
		scanner.close();
	}

}
