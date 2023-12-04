package com.bridgelabs.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Program");

		MoodAnalyser moodAnalyser;
		String mood;

		// TC-1.1

		try {
			moodAnalyser = new MoodAnalyser("I am in Sad Mood");
			mood = moodAnalyser.analyseMood();
			System.out.println(mood);
		} catch (MoodAnalysisException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		// TC-1.2
		try {
			moodAnalyser = new MoodAnalyser("I am in Any Mood");
			mood = moodAnalyser.analyseMood();
			System.out.println(mood);
		} catch (MoodAnalysisException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		// TC-3.1
		try {
			moodAnalyser = new MoodAnalyser();
			mood = moodAnalyser.analyseMood();
			System.out.println(mood);
		} catch (MoodAnalysisException e) {

			System.out.println("Exception: " + e.getMessage());
		}

		// TC-3.2
		try {
			moodAnalyser = new MoodAnalyser("");
			mood = moodAnalyser.analyseMood();
			System.out.println(mood);
		} catch (MoodAnalysisException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
