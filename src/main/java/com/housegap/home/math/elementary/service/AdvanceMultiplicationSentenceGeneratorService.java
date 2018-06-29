package com.housegap.home.math.elementary.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("advanceMultiplicationSentenceGeneratorService")
public class AdvanceMultiplicationSentenceGeneratorService implements SentenceGeneratorService {

	@Override
	public String generateSentence(int resultFloor, int resultCeiling) {
		Random random = new Random();
		int firstNumber = random.nextInt(resultCeiling);
		if (firstNumber < 2) {
			return generateSentence(resultFloor, resultCeiling);
		}
		int secondNumber = random.nextInt(Math.floorDiv(resultCeiling, firstNumber));
		
		if (firstNumber < 2 || secondNumber < 2 || (firstNumber * secondNumber) < resultFloor) {
			return generateSentence(resultFloor, resultCeiling);
		}
		return firstNumber + " x " + secondNumber + " = ";
	}

}
