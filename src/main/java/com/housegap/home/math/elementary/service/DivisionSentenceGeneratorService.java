package com.housegap.home.math.elementary.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("divisionSentenceGeneratorService")
public class DivisionSentenceGeneratorService implements SentenceGeneratorService {

	@Override
	public String generateSentence(int resultFloor, int resultCeiling) {
		Random random = new Random();
		int firstNumber = random.nextInt(resultCeiling/2);
		int secondNumber = random.nextInt(resultCeiling/2);
		
		if (firstNumber < 3 || secondNumber < 3 || (firstNumber * secondNumber) < resultFloor || (firstNumber * secondNumber) > resultCeiling) {
			return generateSentence(resultFloor, resultCeiling);
		}
		return (firstNumber * secondNumber)  + " / " + secondNumber + " = ";
	}

}
