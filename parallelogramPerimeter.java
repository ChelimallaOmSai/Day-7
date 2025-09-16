package com.codegyan.oopexamples;

public class parallelogramPerimeter {
	static double perimeter(double base, double side) {
		return 2*(base+side);
	}
	public static void main(String[] args) {
		System.out.println("Perimeter of the parallelogram: "+perimeter(2,4));

	}

}
