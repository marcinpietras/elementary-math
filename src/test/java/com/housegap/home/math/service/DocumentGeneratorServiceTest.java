package com.housegap.home.math.service;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.housegap.home.math.elementary.service.DocumentGeneratorService;
import com.housegap.home.math.elementary.vo.MathSectionVO;

public class DocumentGeneratorServiceTest {

	private Logger logger = LoggerFactory.getLogger(DocumentGeneratorServiceTest.class);

	private DocumentGeneratorService documentGeneratorService;

	@Before
	public void setUp() throws Exception {
		documentGeneratorService = new DocumentGeneratorService();
	}

	@Test
	public void testGenerateDocument() {
		List<MathSectionVO> sentences = new LinkedList<MathSectionVO>();
		List<String> additions = new LinkedList<String>();
		additions.add("1 + 1 = ");
		additions.add("1 + 2 = ");
		additions.add("1 + 3 = ");
		additions.add("1 + 4 = ");
		additions.add("1 + 5 = ");
		additions.add("1 + 6 = ");
		sentences.add(new MathSectionVO("Additions", additions));
		String document = documentGeneratorService.generateDocument("Test header", sentences);
		logger.info(document);
	}

}
