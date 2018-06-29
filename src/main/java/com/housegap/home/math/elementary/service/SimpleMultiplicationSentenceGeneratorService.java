package com.housegap.home.math.elementary.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("simpleMultiplicationSentenceGeneratorService")
public class SimpleMultiplicationSentenceGeneratorService implements SentenceGeneratorService {

	@Override
	public String generateSentence(int resultFloor, int resultCeiling) {
		Random random = new Random();
		int firstNumber = random.nextInt(10);
		int secondNumber = random.nextInt(10);
		
		if (firstNumber < 3 || secondNumber < 3 || (firstNumber * secondNumber) < resultFloor || (firstNumber * secondNumber) > resultCeiling) {
			return generateSentence(resultFloor, resultCeiling);
		}
		return firstNumber + " x " + secondNumber + " = ";
	}

}
