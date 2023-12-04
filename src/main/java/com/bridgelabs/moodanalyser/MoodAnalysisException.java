package com.bridgelabs.moodanalyser;

public class MoodAnalysisException extends Exception {

	private static final long serialVersionUID = 1L;

	public MoodAnalysisException(MoodAnalysisErrors error) {
		super(error.getMessage());
	}

}
