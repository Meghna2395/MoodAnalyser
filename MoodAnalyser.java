package com.bridzelabz;

import java.util.Scanner;

public class MoodAnalyser {
	
	public MoodAnalyser() {
		
	}

	public String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	 public String analyseMood() {
	        if (message.contains("Sad")){
	            return "SAD";
	        }else{
	            return "HAPPY";
	        }

	}
}