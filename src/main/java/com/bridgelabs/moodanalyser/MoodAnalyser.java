package com.bridgelabs.moodanalyser;

public class MoodAnalyser {

	private String message;

	/*
	 * @Description: Default Constructor
	 * 
	 * @param: None
	 * 
	 * @return:None
	 */
	public MoodAnalyser() {
	}

	/*
	 * @Description: Parameterized Constructor to initialize message
	 * 
	 * @param: String message
	 * 
	 * @return:None
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/*
	 * @Description- This method is used to analyse mood of the user
	 * 
	 * @param- None
	 * 
	 * @return-String mood
	 */

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisErrors.EMPTY_MESSAGE);

			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		}

		catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisErrors.NULL_MESSAGE);
		}
	}
}
