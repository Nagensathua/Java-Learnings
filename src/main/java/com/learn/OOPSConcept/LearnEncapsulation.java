package com.learn.OOPSConcept;

public class LearnEncapsulation {

	// Encapsulation is the process of hiding data(variable) and make it only accessible only using getter and setter method
	
	
	
	private String name;//this is private variable and cannot be accessed publically
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Data security (prevents unauthorized access)
	//✔ Flexibility to modify fields without affecting external code
	//✔ Improves code maintainability
	
	
}
