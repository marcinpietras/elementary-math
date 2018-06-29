package com.housegap.home.math.service;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.SentenceGeneratorService;
import com.housegap.home.math.elementary.service.SubstractionSentenceGeneratorService;

public class SubstractionSentenceGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(SubstractionSentenceGeneratorServiceTest.class);

	private SentenceGeneratorService sentenceGeneratorService;

	@Before
	public void setUp() throws Exception {
		sentenceGeneratorService = new SubstractionSentenceGeneratorService();
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
	public void testGenerateSentence3to100() {
		String sentence;
		logger.info("Generating 20 sentences from 3 to 100");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(3, 100);
			logger.info(sentence);
		}
	}

}
