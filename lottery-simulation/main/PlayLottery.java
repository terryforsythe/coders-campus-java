package main;

import java.util.HashSet;
import java.util.Set;

public class PlayLottery {

	public Set<Integer> matchLotteryNumbers(Set<Integer> lotteryNumbers, Set<Integer> userNumbers) {

		Set<Integer> matchedNumbers = new HashSet<Integer>();

		for (int lotteryNumber : lotteryNumbers) {

			if (userNumbers.contains(lotteryNumber)) {
				matchedNumbers.add(lotteryNumber);
			}
		}

		return matchedNumbers;
	}

}
