package com.bridgelabs.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Program");

		MoodAnalyser moodAnalyser = new MoodAnalyser();

		// TC-1.1

		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		System.out.println(mood);

		// TC-1.2

		String mood1 = moodAnalyser.analyseMood("I am in Any Mood");
		System.out.println(mood1);
	}

}
