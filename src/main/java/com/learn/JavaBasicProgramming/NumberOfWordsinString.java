package com.learn.JavaBasicProgramming;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class NumberOfWordsinString {
	
	public void countWords(String str) {
		
		String words[] = str.split(" ");
		System.out.println("number of words in String = "+words.length);
	}

}
