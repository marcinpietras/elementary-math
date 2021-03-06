package com.housegap.home.math.service;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.DivisionSentenceGeneratorService;
import com.housegap.home.math.elementary.service.SentenceGeneratorService;

public class DivisionSentenceGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(DivisionSentenceGeneratorServiceTest.class);

	private SentenceGeneratorService sentenceGeneratorService;

	@Before
	public void setUp() throws Exception {
		sentenceGeneratorService = new DivisionSentenceGeneratorService();
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
	
	@Test
	public void testGenerateSentence10to150() {
		String sentence;
		logger.info("Generating 20 sentences from 10 to 150");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(10, 150);
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
