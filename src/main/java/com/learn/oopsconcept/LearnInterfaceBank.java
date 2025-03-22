package com.learn.oopsconcept;

interface LearnInterfaceBank {
	
	// 100% abstraction - only method declaration allowed no method body
	// only abstract method declaration
	// cannot be initiated, no object creation
	//implemented by class using implement class
	// supports multiple inheritance
	
	
	// variables
	// interface variables are always public static final in nature
	//public - accessible anywhere
	// static - shared among all implemented class
	// final - cannot be changed after declaration
	
	int x = 10;
	int y = 20;
	
	public void customerUpdate();
	public void loan();
	public void withdrwal();
	public void transaction();
	
	

}
