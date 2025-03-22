package com.learn.oopsconcept;

abstract class LearnAbstractionAnimal {
	
	//  can have both abstract and non abstract methods
	//abstract method - only method declaration, no method body
	// variables are protected in nature
	//cannot be initiated, means no object creation
	// must be inherited sub class to implement abstract method
	
	//Variables
	// Can have public variable, static variable and final variable
	// Public variable - can be accessed globally(any class)
	// Static variable - can be initiated by any instance created for the class
	//final variable - constant or value cannot be changed once declared
	
	int age = 5;
	static String type = "domestic";
	final String species = "Mamal";
	
	
	abstract void makeSound();// abstract method starts from abstract keyword
	public void displayInfo() {
		
		System.out.println("Age: "+age);
		System.out.println("Type: "+type);
		System.out.println("Species: "+species);
	}
	

}
