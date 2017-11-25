package com.TheMasterMindGroup.IfAndSwitchStatements;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value from 1 to 12 for the month of the year");

		int month = input.nextInt();
		String monthString;

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default : monthString = "Invalid data, expect value from 1 - 12: ";
			break;
		}
		System.out.println("The month of the year is " + monthString);

	}

}
