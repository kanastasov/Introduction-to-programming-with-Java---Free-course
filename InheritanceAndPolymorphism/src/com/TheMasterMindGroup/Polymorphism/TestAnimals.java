package com.TheMasterMindGroup.Polymorphism;

public class TestAnimals {

	public static void main(String[] args) {

		Dogs germanShepart = new Dogs();
		germanShepart.setBarking("Barking");
		germanShepart.setCuddle("Cudling");
		germanShepart.setEat("Give me Food!");
		germanShepart.setWalk("Running");
		

		
		Dogs smallDog = new Dogs();
		smallDog.setBarking("Too small to bark");
		
		Cats littleKitty = new Cats();
		littleKitty.setMial("Miaaall");
		
		
		displayAnimals(littleKitty);
		displayAnimals(smallDog);
		
		Dogs doggoArjentino = new Dogs();
		doggoArjentino.setBarking("Big bark");
		doggoArjentino.setEat("Give me a lot of food");
		
		displayAnimals(doggoArjentino);
		
		
	}

	
	private static void displayAnimals(Animals animalObj) {
		
		System.out.println(animalObj.toString());
	}
	
}
