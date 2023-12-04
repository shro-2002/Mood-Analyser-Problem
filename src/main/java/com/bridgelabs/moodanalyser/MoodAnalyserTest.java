package com.bridgelabs.moodanalyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;

	@Test
	void SadMoodtest() {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	void HappyMoodtest() {
		moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

	@Test
	void NullMood() {
		moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}
}
