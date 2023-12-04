package com.bridgelabs.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Mood Analyser Program");

		MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
		MoodAnalyser moodAnalyser2 = new MoodAnalyser("I am in Any Mood");
		MoodAnalyser moodAnalyser3 = new MoodAnalyser();

		// TC-1.1

		String mood = moodAnalyser1.analyseMood();
		System.out.println(mood);

		// TC-1.2

		String mood1 = moodAnalyser2.analyseMood();
		System.out.println(mood1);

		// TC-2.1
		String mood3 = moodAnalyser3.analyseMood();
		System.out.println(mood3);
	}

}
