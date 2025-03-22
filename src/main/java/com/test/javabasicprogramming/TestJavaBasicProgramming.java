package com.test.javabasicprogramming;

import com.learn.javabasicprogramming.EvenOrOddProgram;
import com.learn.javabasicprogramming.LargestNumberInArray;
import com.learn.javabasicprogramming.NumberOfWordsinString;
import com.learn.javabasicprogramming.ReverseStringProgram;
import com.learn.javabasicprogramming.SwapNumbersProgram;

public class TestJavaBasicProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------------------------------------------------------------");
		EvenOrOddProgram eoop = new EvenOrOddProgram();
		eoop.evenOrOdd(13);
		
		ReverseStringProgram rsp = new ReverseStringProgram();
		rsp.reverseString("NagenSathua");
		
		LargestNumberInArray lnir = new LargestNumberInArray();
		int[] arr1 = {10,20,35,25,45};
		lnir.largestNumber(arr1);
		
		SwapNumbersProgram snp = new SwapNumbersProgram();
		snp.swapNumbers(10, 20);
		
		NumberOfWordsinString nows = new NumberOfWordsinString();
		nows.countWords("my name is nagen");
		System.out.println("----------------------------------------------------------------------");
	}

}
