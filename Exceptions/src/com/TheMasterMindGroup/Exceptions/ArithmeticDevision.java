package com.TheMasterMindGroup.Exceptions;

import java.util.Scanner;

public class ArithmeticDevision {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers for devision: ");
		
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		
	
		try {
			int result = resultIntegers(firstNumber, secondNumber);
			System.out.println(firstNumber + "/" + secondNumber + " is " + result);
		}catch (ArithmeticException ex) {
			System.out.println(ex);
		}
	}

	public static int resultIntegers(int firstNumber, int secondNumber) {
		
		if(secondNumber == 0) {
			throw new ArithmeticException("The second number can not be zero: ");
			
		}
		return firstNumber / secondNumber;
	}
}
