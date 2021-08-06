package com.bridzelabz;

import java.util.Scanner;

public class MoodAnalyser {
	
	public String message;
	
	public MoodAnalyser() {
		
	}

	 public MoodAnalyser(String message) {
	        this.message = message;
	    }

	    public String analyseMood() {
	        try {
	            if (message.contains("Sad")) {
	                return "SAD";
	            }
	        } catch (NullPointerException e) {
	            return "HAPPY";
	        }
	        return null;
	    }
}