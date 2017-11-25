package com.TheMasterMindGroup.Arrays;

public class BasicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		elementType arrayRefVar[] = new elementType[arraySize];
		
		double[] myList = {1, 8, 2.9, 3.4, 4.6, 2,1};
		
		
		printArraysValues(myList);
		symArrayValues(myList);
		maxInArray(myList);
		
	}
	
	private static void printArraysValues(double[] myList) {
		
		for(int i=0;i<myList.length; i++) {

			System.out.println(myList[i]);
		}
		
	}
	
	private static void symArrayValues(double[] myList) {
		
		double sum = 0;
		for(int i=0; i< myList.length; i++) {
			sum += myList[i];
		}
		
		System.out.println("The sum of the array is : " + sum);
	}
	
	private static void maxInArray(double[] myList) {
		
		double temp = 0;
		for(double value: myList) {
			if(value > temp) {
				temp = value;
			}
		}
		System.out.println("The max value from the array is : " + temp);
		
		
	}

}
