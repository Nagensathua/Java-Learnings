package com.learn.oopsconcept;

public class LearnPolymorphismMethodOverloading {

	public void details(int age, String name) {
		System.out.println("Father age is = "+age);
		System.out.println("Father name is = "+name);
	}
	
	public void details(int age, String name, String country) {
		System.out.println("son age is = "+age);
		System.out.println("son name is = "+name);
		System.out.println("son country is = "+country);
	}
}
