package com.bridgelabs.moodanalyser;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * @description: This class is used to test cases for mood analyser
 * 
 * @method: SadMoodtest(), HappyMoodtest(), NullMood(), EmptyMood()
 * 
 */
class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;

	/*
	 * @description: This method is used to test sad mood
	 * 
	 * @Param: Sad Message
	 * 
	 * @return: SAD
	 */
	@Test
	void SadMoodtest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	/*
	 * @description: This method is used to test happy mood
	 * 
	 * @Param: Happy Message
	 * 
	 * @return: HAPPY
	 */
	@Test
	void HappyMoodtest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

	/*
	 * @description: This method is used to test null mood
	 * 
	 * @Param: Null Message
	 * 
	 * @return: MoodAnalysisException(NULL_Error)
	 */

	@Test
	void NullMood() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser();
		assertThrows(MoodAnalysisException.class, () -> moodAnalyser.analyseMood());
	}

	/*
	 * @description: This method is used to test empty mood
	 * 
	 * @Param: Empty Message
	 * 
	 * @return: MoodAnalysisException(Empty_Error)
	 */
	@Test
	void EmptyMood() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("");
		assertThrows(MoodAnalysisException.class, () -> moodAnalyser.analyseMood());
	}
}
