package com.learn.javabasicprogramming;
import java.lang.String;

public class LargestNumberInArray {
	
	public void largestNumber(int[] arr) {
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
			
			
		}
		System.out.println("largest number in the arra = "+max);
	}

}
