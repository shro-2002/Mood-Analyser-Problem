package com.bridgelabs.moodanalyser;

public class MoodAnalyser {

	/*
	 * @Description- This method is used to analyse mood of the user
	 * 
	 * @param- String message
	 * 
	 * @return-String mood
	 */

	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
