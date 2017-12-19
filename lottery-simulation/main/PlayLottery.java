package main;

import java.util.HashSet;
import java.util.Set;

public class PlayLottery {

	public Set<Integer> matchLotteryNumbers(Set<Integer> lotteryNumbers, Set<Integer> userLotteryNumbers) {

		Set<Integer> matchedNumbers = new HashSet<Integer>();

		for (int lotteryNumber : lotteryNumbers) {

			if (userLotteryNumbers.contains(lotteryNumber)) {
				matchedNumbers.add(lotteryNumber);
			}
		}

		return matchedNumbers;
	}

}
