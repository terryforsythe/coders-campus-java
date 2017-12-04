package main;

import java.util.HashSet;
import java.util.Set;

public class LotteryNumberGenerator {

	public static int generateSingleLotteryNumber() {
		return (int) (Math.random() * 49 + 1);
	}

	public Set<Integer> generateLotteryNumbers() {

		Set<Integer> lotteryNumbers = new HashSet<Integer>();

		while (lotteryNumbers.size() != 6) {
			lotteryNumbers.add(generateSingleLotteryNumber());
		}

		return lotteryNumbers;
	}

}
