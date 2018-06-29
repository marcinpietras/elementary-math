package com.housegap.home.math.elementary.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("additionSentenceGeneratorService")
public class AdditionSentenceGeneratorService implements SentenceGeneratorService {

	@Override
	public String generateSentence(int resultFloor, int resultCeiling) {
		Random random = new Random();
		int firstNumber = random.nextInt(resultCeiling);
		int secondNumber = random.nextInt(resultCeiling - firstNumber);
		
		if (firstNumber < 2 || secondNumber < 2 || (firstNumber + secondNumber) < resultFloor) {
			return generateSentence(resultFloor, resultCeiling);
		}
		return firstNumber + " + " + secondNumber + " = ";
	}

}
