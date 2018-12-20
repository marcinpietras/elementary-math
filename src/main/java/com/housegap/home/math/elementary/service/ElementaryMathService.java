package com.housegap.home.math.elementary.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.housegap.home.math.elementary.vo.MathSectionVO;

@Component
public class ElementaryMathService implements MathService {

	@Autowired
	@Qualifier("additionSentenceGeneratorService")
	private SentenceGeneratorService additionSentenceGeneratorService;

	@Autowired
	@Qualifier("substractionSentenceGeneratorService")
	private SentenceGeneratorService substractionSentenceGeneratorService;

	@Autowired
	@Qualifier("simpleMultiplicationSentenceGeneratorService")
	private SentenceGeneratorService simpleMultiplicationSentenceGeneratorService;

	@Autowired
	@Qualifier("advanceMultiplicationSentenceGeneratorService")
	private SentenceGeneratorService advanceMultiplicationSentenceGeneratorService;

	@Autowired
	@Qualifier("divisionSentenceGeneratorService")
	private SentenceGeneratorService divisionSentenceGeneratorService;

	@Override
	public List<MathSectionVO> getMathSentences(String gradeKey) throws IllegalArgumentException {
		List<MathSectionVO> sections = new LinkedList<MathSectionVO>();
		if ("2".equalsIgnoreCase(gradeKey)) {
			sections.add(new MathSectionVO("Addition", generateAdditionSentence(10, 20, 100)));
			sections.add(new MathSectionVO("Substraction", generateSubstractionSentence(10, 5, 100)));
			sections.add(new MathSectionVO("Simple Multiplication", generateSimpleMultiplicationSentence(10, 10, 40)));
			sections.add(
					new MathSectionVO("Advance Multiplication", generateAdvanceMultiplicationSentence(10, 20, 100)));
			sections.add(new MathSectionVO("Division", generateDivisionSentence(10, 20, 40)));
		} else if ("3".equalsIgnoreCase(gradeKey)) {
			sections.add(new MathSectionVO("Addition", generateAdditionSentence(10, 20, 100)));
			sections.add(new MathSectionVO("Substraction", generateSubstractionSentence(10, 5, 100)));
			sections.add(new MathSectionVO("Simple Multiplication", generateSimpleMultiplicationSentence(10, 10, 100)));
			sections.add(
					new MathSectionVO("Advance Multiplication", generateAdvanceMultiplicationSentence(10, 20, 100)));
			sections.add(new MathSectionVO("Division", generateDivisionSentence(10, 20, 100)));
		} else if ("4".equalsIgnoreCase(gradeKey)) {
			sections.add(new MathSectionVO("Addition", generateAdditionSentence(10, 20, 100)));
			sections.add(new MathSectionVO("Substraction", generateSubstractionSentence(10, 5, 100)));
			sections.add(new MathSectionVO("Simple Multiplication", generateSimpleMultiplicationSentence(10, 10, 100)));
			sections.add(
					new MathSectionVO("Advance Multiplication", generateAdvanceMultiplicationSentence(10, 20, 150)));
			sections.add(new MathSectionVO("Division", generateDivisionSentence(10, 20, 100)));
		} else if ("5".equalsIgnoreCase(gradeKey)) {
			sections.add(new MathSectionVO("Addition", generateAdditionSentence(10, 20, 200)));
			sections.add(new MathSectionVO("Substraction", generateSubstractionSentence(10, 5, 200)));
			sections.add(new MathSectionVO("Simple Multiplication", generateSimpleMultiplicationSentence(10, 10, 100)));
			sections.add(
					new MathSectionVO("Advance Multiplication", generateAdvanceMultiplicationSentence(10, 20, 250)));
			sections.add(new MathSectionVO("Division", generateDivisionSentence(10, 20, 150)));
		} else {
			throw new IllegalArgumentException("Supported grades: 2, 3, 4, 5");
		}
		return sections;
	}

	private List<String> generateAdditionSentence(int quantity, int resultFloor, int resultCeiling) {
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < quantity) {
			sentences.add(additionSentenceGeneratorService.generateSentence(resultFloor, resultCeiling));
		}
		return new ArrayList<String>(sentences);
	}

	private List<String> generateSubstractionSentence(int quantity, int resultFloor, int resultCeiling) {
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < quantity) {
			sentences.add(substractionSentenceGeneratorService.generateSentence(resultFloor, resultCeiling));
		}
		return new ArrayList<String>(sentences);
	}

	private List<String> generateSimpleMultiplicationSentence(int quantity, int resultFloor, int resultCeiling) {
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < quantity) {
			sentences.add(simpleMultiplicationSentenceGeneratorService.generateSentence(resultFloor, resultCeiling));
		}
		return new ArrayList<String>(sentences);
	}

	private List<String> generateAdvanceMultiplicationSentence(int quantity, int resultFloor, int resultCeiling) {
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < quantity) {
			sentences.add(advanceMultiplicationSentenceGeneratorService.generateSentence(resultFloor, resultCeiling));
		}
		return new ArrayList<String>(sentences);
	}

	private List<String> generateDivisionSentence(int quantity, int resultFloor, int resultCeiling) {
		Set<String> sentences = new HashSet<String>();
		while (sentences.size() < quantity) {
			sentences.add(divisionSentenceGeneratorService.generateSentence(resultFloor, resultCeiling));
		}
		return new ArrayList<String>(sentences);
	}

}
