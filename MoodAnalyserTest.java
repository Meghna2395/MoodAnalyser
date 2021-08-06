package com.bridzelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


	 @Test
	    public void ShouldReturnSad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
	        String mood =moodAnalyser.analyseMood();
	        Assert.assertEquals("SAD",mood);
	    }

	    @Test
	    public void ShouldReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
	        String mood =moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY",mood);
	    }

	     @Test
	    public void NullMood_ShouldThrowException() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String mood =moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY",mood);
	    }
	
}

