package com.learn.javabasicprogramming;

public class ReverseStringProgram {
	
	public void reverseString(String str1) {
		String rev = new StringBuilder(str1).reverse().toString();
		System.out.println("Using String builder = "+rev);
		
		String revstring = "";
		for(int i=str1.length()-1;i>=0;i--) {
			//System.out.println(str1);
			revstring +=str1.charAt(i);
		
	}
		System.out.println("Using loop = "+revstring);

}
}

