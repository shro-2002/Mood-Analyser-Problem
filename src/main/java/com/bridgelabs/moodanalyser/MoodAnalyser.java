package com.bridgelabs.moodanalyser;

public class MoodAnalyser {

	private String message;

	/*
	 * @Description- Default Constructor
	 * 
	 * @param- None
	 * 
	 * @return-None
	 */
	public MoodAnalyser() {
		System.out.print("Default Constructor");
	}

	/*
	 * @Description- Parameterized Constructor to initialize message
	 * 
	 * @param- String message
	 * 
	 * @return-None
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/*
	 * @Description- This method is used to analyse mood of the user
	 * 
	 * @param- String message
	 * 
	 * @return-String mood
	 */

	public String analyseMood() {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
