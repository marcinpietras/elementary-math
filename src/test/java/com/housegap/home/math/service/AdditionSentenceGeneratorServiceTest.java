package com.housegap.home.math.service;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.AdditionSentenceGeneratorService;
import com.housegap.home.math.elementary.service.SentenceGeneratorService;

public class AdditionSentenceGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(AdditionSentenceGeneratorServiceTest.class);

	private SentenceGeneratorService sentenceGeneratorService;

	@Before
	public void setUp() throws Exception {
		sentenceGeneratorService = new AdditionSentenceGeneratorService();
	}

	@Test
	public void testGenerateSentence10to100() {
//		String sentence;
//		logger.info("Generating 20 sentences from 10 to 100");
//		for (int i = 0; i < 20; i++) {
//			String sentence = sentenceGeneratorService.generateSentence(10, 100);
//			logger.info(sentence);
//		}
		int max = 20;
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < max) {
			String sentence = sentenceGeneratorService.generateSentence(10, 100);
			sentences.add(sentence);
			logger.info(sentence);
		}
		logger.info("Number of sentences: " + sentences.size());
	}
	
	@Test
	public void testGenerateSentence50to100() {
		String sentence;
		logger.info("Generating 20 sentences from 50 to 100");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(50, 100);
			logger.info(sentence);
		}
	}

	@Test
	public void testGenerateSentence80to100() {
		String sentence;
		logger.info("Generating 20 sentences from 80 to 100");
		for (int i = 0; i < 20; i++) {
			sentence = sentenceGeneratorService.generateSentence(80, 100);
			logger.info(sentence);
		}
	}
	
}
