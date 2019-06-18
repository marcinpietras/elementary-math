package com.housegap.home.math.elementary.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.housegap.home.math.elementary.service.DocumentGeneratorService;
import com.housegap.home.math.elementary.service.MathService;
import com.housegap.home.math.elementary.vo.MathSectionVO;

@RestController
public class ElementaryMathController {

	private Logger logger = LoggerFactory.getLogger(ElementaryMathController.class);

	@Autowired
	private MathService mathService;

	@Autowired
	private DocumentGeneratorService documentGeneratorService;

	@RequestMapping("/")
	public String index() {
		logger.info("Getting default");
		return "Hello from Elementary Math!";
	}

	@RequestMapping(value = "/grade/{gradeKey}", method = RequestMethod.GET)
	public ResponseEntity<?> getMathByGradeAndStudent(@PathVariable("gradeKey") @NotNull String gradeKey) {
		logger.info("Getting math for grade: " + gradeKey);
		return getMath(gradeKey, "");
	}

	@RequestMapping(value = "/grade/{gradeKey}/{studentName}", method = RequestMethod.GET)
	public ResponseEntity<?> getMathByGradeAndStudent(@PathVariable("gradeKey") @NotNull String gradeKey,
			@PathVariable("studentName") String studentName) {
		logger.info("Getting math for grade: " + gradeKey + ", student: " + studentName);
		return getMath(gradeKey, studentName);
	}
	
	@RequestMapping(value = "/grade/{gradeKey}/{studentName}/pages/{numberOfPages}", method = RequestMethod.GET)
	public ResponseEntity<?> getMultipleMathByGradeAndStudent(@PathVariable("gradeKey") @NotNull String gradeKey,
			@PathVariable("studentName") String studentName, @PathVariable("numberOfPages") int numberOfPages) {
		logger.info("Getting math for grade: " + gradeKey + ", student: " + studentName + ", numberOfPages: " + numberOfPages);		
		return getMath(gradeKey, studentName, numberOfPages);
	}

	private ResponseEntity<?> getMath(String gradeKey, String studentName) {
		logger.info("Getting math for grade: " + gradeKey);
		try {
			List<MathSectionVO> sentences = mathService.getMathSentences(gradeKey);
			String document = documentGeneratorService.generateDocument(studentName, sentences);
			logger.info("Getting math for grade {} success ", gradeKey);
			return ResponseEntity.ok().body(document);
		} catch (Exception e) {
			logger.error("Getting math for grade {} fail ", e, gradeKey);
			return ResponseEntity.badRequest().body("Error while getting math for grade: " + e.getMessage());
		}
	}

	private ResponseEntity<?> getMath(String gradeKey, String studentName, int numberOfPages) {
		logger.info("Getting math for grade: " + gradeKey);
		try {
			StringBuilder documentBuilder = new StringBuilder();
			for (int n = 0; n < numberOfPages; n++) {
				List<MathSectionVO> sentences = mathService.getMathSentences(gradeKey);
				String document = documentGeneratorService.generateDocument(studentName, sentences);
				documentBuilder.append(document);
			}
			logger.info("Getting math for grade {} success ", gradeKey);
			return ResponseEntity.ok().body(documentBuilder.toString());
		} catch (Exception e) {
			logger.error("Getting math for grade {} fail ", e, gradeKey);
			return ResponseEntity.badRequest().body("Error while getting math for grade: " + e.getMessage());
		}
	}

}
