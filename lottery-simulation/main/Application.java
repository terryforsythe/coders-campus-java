package main;

import java.io.IOException;
import java.util.Set;

public class Application {

	public static void main(String[] args) throws IOException {

		LotteryNumberGenerator generator = new LotteryNumberGenerator();
		Set<Integer> generatedLotteryNumbers = generator.generateSetOfLotteryNumbers();

		LotteryNumberPicker picker = new LotteryNumberPicker();
		Set<Integer> userLotteryNumbers = picker.promptUserForLotteryNumbers();

		System.out.println();

		System.out.println("Today's lottery numbers are: ");

		for (Integer generatedNumber : generatedLotteryNumbers) {
			System.out.print(generatedNumber + " ");
		}

		System.out.println();
		System.out.println();

		LotteryNumberMatcher matcher = new LotteryNumberMatcher();
		Set<Integer> matchedNumbers = matcher.matchLotteryNumbers(generatedLotteryNumbers, userLotteryNumbers);

		if (matchedNumbers.size() > 0) {

			System.out.println("Your matching numbers were: ");

			for (Integer matchedNumber : matchedNumbers) {
				System.out.print(matchedNumber + " ");
			}

		}
		
		System.out.println();
		System.out.println();

		System.out.println("Thanks for playing the lottery!");

	}

}
