package com.housegap.home.math.service;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.AdvanceMultiplicationSentenceGeneratorService;
import com.housegap.home.math.elementary.service.SentenceGeneratorService;

public class AdvanceMultiplicationSentenceGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(AdvanceMultiplicationSentenceGeneratorServiceTest.class);

	private SentenceGeneratorService sentenceGeneratorService;

	@Before
	public void setUp() throws Exception {
		sentenceGeneratorService = new AdvanceMultiplicationSentenceGeneratorService();
	}

	@Test
	public void testGenerateSentence10to100() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 100");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 100);
			logger.info(sentence);
		}
	}
	
	@Test
	public void testGenerateSentence10to50() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 50");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 50);
			logger.info(sentence);
		}
	}
	
	@Test
	public void testGenerateSentence10to200() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 200");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 200);
			logger.info(sentence);
		}
	}

}
