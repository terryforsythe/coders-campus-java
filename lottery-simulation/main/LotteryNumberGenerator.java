package main;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberGenerator {

	private int generateLotteryNumber() {
		Random lotteryNumber = new Random();
		return lotteryNumber.nextInt(49) + 1;
	}

	private boolean isIncompleteLotterySet(Set<Integer> lotteryNumbers) {
		return lotteryNumbers.size() < 6;
	}

	public Set<Integer> generateSetOfLotteryNumbers() {

		Set<Integer> lotteryNumbers = new HashSet<Integer>();

		while (isIncompleteLotterySet(lotteryNumbers)) {
			lotteryNumbers.add(generateLotteryNumber());
		}

		return lotteryNumbers;
	}

	public int test_generateLotteryNumber() {
		return generateLotteryNumber();
	}
}
