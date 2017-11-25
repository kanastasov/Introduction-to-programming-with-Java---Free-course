package com.TheMasterMindGroup.Homework;

import java.util.Scanner;

public class PoundsIntoKilograms {
	static double kilograms= 0;
	public static void main(String[] args) {
		
		// Create new Scanner object
		Scanner input = new Scanner(System.in); 	
		double kilogramsInPounds = 0.454;	

		//Ask the user for the number in pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		// Convert into kilograms
		kilograms = pounds * kilogramsInPounds;

		// show the results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}
	
	
	
}
