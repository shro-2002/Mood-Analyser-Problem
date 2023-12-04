package com.bridgelabs.moodanalyser;

/*
 * @Description: This is a enum class for mood analysis errors.
 * 
 * @Constants: EMPTY_MESSAGE, NULL_MESSAGE
 */
public enum MoodAnalysisErrors {
	EMPTY_MESSAGE("Empty String"), NULL_MESSAGE("Mood is Null");

	private String message;

	/*
	 * @Description: This is a constructor for MoodAnalysisErrors class.
	 * 
	 * @param: String message
	 * 
	 * @return: None
	 */
	private MoodAnalysisErrors(String message) {
		this.message = message;
	}

	/*
	 * @Description: This is a method to get message.
	 * 
	 * @param: None
	 * 
	 * @return: String message
	 */
	public String getMessage() {
		return message;
	}
}
