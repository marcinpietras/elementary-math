package com.housegap.home.math.service;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.SentenceGeneratorService;
import com.housegap.home.math.elementary.service.SimpleMultiplicationSentenceGeneratorService;

public class SimpleMultiplicationSentenceGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(SimpleMultiplicationSentenceGeneratorServiceTest.class);

	private SentenceGeneratorService sentenceGeneratorService;

	@Before
	public void setUp() throws Exception {
		sentenceGeneratorService = new SimpleMultiplicationSentenceGeneratorService();
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
	public void testGenerateSentence10to32() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 32");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 32);
			logger.info(sentence);
		}
	}
	
	@Test
	public void testGenerateSentence10to48() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 48");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 48);
			logger.info(sentence);
		}
	}

}
