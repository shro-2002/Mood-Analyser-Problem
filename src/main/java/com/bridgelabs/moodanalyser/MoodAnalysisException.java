package com.bridgelabs.moodanalyser;

/*
 * @Description: This class is used to throw custom exceptions for MoodAnalyser class.
 * 
 * Exception types: EMPTY, NULL
 */

public class MoodAnalysisException extends Exception {

	private static final long serialVersionUID = 1L;

	public MoodAnalysisException(MoodAnalysisErrors error) {
		super(error.getMessage());
	}

}