package com.TheMasterMindGroup.IfAndSwitchStatements;

import java.util.Scanner;

public class IfMathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a + or a -");
		
		String sign = input.nextLine();
		
		int firstValue = input.nextInt();
		
		int secondValue = input.nextInt();
		
		
		if(sign.equals("+")) {
			
			System.out.println("The addition of: " + firstValue + " " + secondValue + " is " +(firstValue + secondValue));
			
		} else if (sign.equals("-")) {
			System.out.println("The subtraction of: " + firstValue + " " + secondValue + " is " +(firstValue - secondValue));
		} else {
			System.out.println("Incorect sign: you need to enter + or -");
		}
		
		
		
	}

}
