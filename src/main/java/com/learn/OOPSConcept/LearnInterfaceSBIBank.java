package com.learn.OOPSConcept;

public class LearnInterfaceSBIBank implements LearnInterfaceBank {
	long phone;
	String address;
	String id;
	
	public LearnInterfaceSBIBank(long phone, String address, String id) {
		// TODO Auto-generated constructor stub
		this.phone=phone;
		this.address=address;
		this.id=id;
	}
	
	@Override
	public void customerUpdate() {
		// TODO Auto-generated method stub
		
		System.out.println("Updated Phone: "+phone);
		System.out.println("Updated Address: "+address);
		System.out.println("Updated id proof: "+id);
	
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Credit score");
		System.out.println("Loan Provided");
		
	}

	@Override
	public void withdrwal() {
		// TODO Auto-generated method stub
		
		System.out.println("Withdrawl limit");
		
	}

	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		System.out.println("Transaction history  ");
		
	}
	
	public void accountDetails(String name, int accountNumber) {
		System.out.println("SBI: Account Details Retrieved");
	}
}
