package com.housegap.home.math.elementary.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("substractionSentenceGeneratorService")
public class SubstractionSentenceGeneratorService implements SentenceGeneratorService {

	@Override
	public String generateSentence(int resultFloor, int resultCeiling) {
		Random random = new Random();
		int firstNumber = random.nextInt(resultCeiling);
		int secondNumber = random.nextInt(resultCeiling);
		
		if (firstNumber < 2 || secondNumber < 2) {
			return generateSentence(resultFloor, resultCeiling);
		}
		
		if (firstNumber > secondNumber) {
			if ((firstNumber - secondNumber) < resultFloor ) {
				return generateSentence(resultFloor, resultCeiling);
			}
			return firstNumber + " - " + secondNumber + " = ";
		} else {
			if ((secondNumber - firstNumber) < resultFloor ) {
				return generateSentence(resultFloor, resultCeiling);
			}
			return secondNumber + " - " + firstNumber + " = ";
		}
	}

}
