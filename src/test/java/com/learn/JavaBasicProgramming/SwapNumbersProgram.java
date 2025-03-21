package com.learn.JavaBasicProgramming;

public class SwapNumbersProgram {
	
	public void swapNumbers(int x, int y) {
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(" number swapped "+x+" "+y);
	}

}
