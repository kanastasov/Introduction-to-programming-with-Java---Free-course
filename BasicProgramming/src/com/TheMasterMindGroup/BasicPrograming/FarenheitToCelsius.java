package com.TheMasterMindGroup.BasicPrograming;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Fahrenheit: ");
		
		double fahrenheit = input.nextDouble();
		

//		celsius = (5.0 / 9) * (fahrenheit - 32);
		
		double celsiu = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println("Fahrenheit " + fahrenheit + " is " +
				 celsiu + " in Celsius");
		
	}

}
