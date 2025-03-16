package com.test.JavaBasicProgramming;

import com.learn.OOPSConcept.LearnAbstractionDog;
import com.learn.OOPSConcept.LearnEncapsulation;
import com.learn.OOPSConcept.LearnInheritanceFather;
import com.learn.OOPSConcept.LearnInheritanceSon1;
import com.learn.OOPSConcept.LearnInheritanceSon2;
import com.learn.OOPSConcept.LearnInterfaceHDFCBank;
import com.learn.OOPSConcept.LearnInterfaceSBIBank;
import com.learn.OOPSConcept.LearnPolymorphismMethodOverloading;
import com.learn.OOPSConcept.LearnPolymorphismMethodOverridingFather;
import com.learn.OOPSConcept.LearnPolymorphismMethodOverridingSon;

public class TestJavaOOPSConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LearnEncapsulation le = new LearnEncapsulation();
		le.setName("Nagen");
		System.out.println("Encapsuled name is = "+le.getName());
		System.out.println("-----------------------------------------------------------------------");

		//String name, int age, String city, String state, String country, String occupation
		LearnInheritanceFather lisf = new LearnInheritanceFather();
		lisf.fatherDetails("Kishore", 60, "Banki", "Odisha", "India", "Army");
		System.out.println("-----------------------------------------------------------------------");
		// son1 inherit properties of father- Single inheritance
		// Son1 and Son2 inherit properties of father - Multiple Inheritance
		LearnInheritanceSon1 lis1 = new LearnInheritanceSon1();
		lis1.Son1Details("Jagan", 34, "Banki", "Odisha", "India", "Army");
		lis1.fatherDetails("Kishore", 60, "Banki", "Odisha", "India", "Army");
		System.out.println("-----------------------------------------------------------------------");
		LearnInheritanceSon2 lis2 = new LearnInheritanceSon2();
		lis2.Son2Details("Nagen", 30, "Pune", "Maharashtra", "India", "Engineer");
		lis2.fatherDetails("Kishore", 60, "Banki", "Odisha", "India", "Army");
		System.out.println("-----------------------------------------------------------------------");
		
		*/
		/*
		//Method OverLoading
		LearnPolymorphismMethodOverloading lpmo = new LearnPolymorphismMethodOverloading();
		lpmo.details(60, "Kishore");
		lpmo.details(30, "Nagen", "India");
		
		//Method Overriding
		LearnPolymorphismMethodOverridingSon lpmos = new LearnPolymorphismMethodOverridingSon();
		lpmos.details(30, "Nagen");
		LearnPolymorphismMethodOverridingFather lpmosfs = new LearnPolymorphismMethodOverridingSon();
		lpmosfs.details(60, "Kishore");
		*/
		
		//Abstraction
		/*
		LearnAbstractionDog lad = new LearnAbstractionDog();
		lad.makeSound();
		lad.displayInfo();
		*/
		//Interface
		System.out.println("-------------------------------------------");
		LearnInterfaceHDFCBank lihb = new LearnInterfaceHDFCBank(987654321,"Pune,India","Aadhar");
		lihb.accountDetails("Nagen", 12345);
		lihb.customerUpdate();
		lihb.withdrwal();
		lihb.transaction();
		lihb.loan();
		
		System.out.println("-------------------------------------------");
		LearnInterfaceSBIBank lisb = new LearnInterfaceSBIBank(987654322,"Pune,India","Aadhar");
		lisb.accountDetails("Nagen", 54321);
		lisb.customerUpdate();
		lisb.withdrwal();
		lisb.transaction();
		lisb.loan();
		System.out.println("-------------------------------------------");
		

	}

}
