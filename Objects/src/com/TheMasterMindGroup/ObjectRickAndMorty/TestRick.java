package com.TheMasterMindGroup.ObjectRickAndMorty;

public class TestRick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Rick rick1 = new Rick();
		System.out.println("rick1 " + rick1.toString());
		
		Rick rick2 = new Rick(true,true,true);
		System.out.println("rick2 " + rick2.toString());
		
		Rick rick3 = new Rick(false,false,false);
		System.out.println("rick3 " + rick3.toString());
		
	}

}
