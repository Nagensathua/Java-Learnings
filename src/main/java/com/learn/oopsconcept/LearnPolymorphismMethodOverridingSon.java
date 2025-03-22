package com.learn.oopsconcept;

public class LearnPolymorphismMethodOverridingSon extends LearnPolymorphismMethodOverridingFather {

	@Override
	public void details(int age, String name) {
		System.out.println("son age is = "+age);
		System.out.println("son name is = "+name);
	}
}
