package com.TheMasterMindGroup.Methods;

public class MaxValuesVoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstValue = 88;
		int secondValue = 66;
		
		 maxValue(firstValue, secondValue);
		
		
	}

	
	public static void maxValue(int firstParam, int secondParam) {
		
		int result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		
		System.out.println("The Max is : " + result);
	}
}
