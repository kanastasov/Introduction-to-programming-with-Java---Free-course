package com.TheMasterMindGroup.MultidimentionalArrays;

public class BasicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		elementType arrayRefVar[] = new elementType[arraySize];
		
		double[] myList = {1, 8, 2.9, 3.4, 4.6, 2,1};
		
		maxInArray(myList);
		
		

		
		double[][] myMultiList = {
				{1, 2.3, 3.5},
				{4.4, 5, 6},
				{7, 8.2, 9},
				{10.10, 11, 12}
				};
		printArraysValues(myMultiList);
		symArrayValues(myMultiList);
	}
	
	private static void printArraysValues(double[][] myList) {
		
		for(int i=0;i<myList.length; i++) {
			for(int j=0; j<myList[i].length; j++)
			System.out.println(myList[i][j]);
		}
		
	}
	
	private static void symArrayValues(double[][] myList) {
		
		double sum = 0;
		for(int i=0; i< myList.length; i++) {
			for(int j=0; j<myList[i].length; j++) {
				sum += myList[i][j];
			}
			
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
