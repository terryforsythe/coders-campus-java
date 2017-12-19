package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import main.PlayLottery;

public class PlayLotteryTest {

	@Test
	public void shouldMatchGeneratedLotteryNumbersWithUserChosenNumbers() {

		PlayLottery lottery = new PlayLottery();
		final int LOTTERY_SIZE = 6;

		Set<Integer> lotteryNumbers = new HashSet<Integer>(LOTTERY_SIZE);
		lotteryNumbers.add(6);
		lotteryNumbers.add(12);
		lotteryNumbers.add(18);
		lotteryNumbers.add(19);
		lotteryNumbers.add(26);
		lotteryNumbers.add(37);

		Set<Integer> userLotteryNumbers = new HashSet<>(LOTTERY_SIZE);
		userLotteryNumbers.add(8);
		userLotteryNumbers.add(9);
		userLotteryNumbers.add(12);
		userLotteryNumbers.add(20);
		userLotteryNumbers.add(23);
		userLotteryNumbers.add(26);

		Set<Integer> result = lottery.matchLotteryNumbers(lotteryNumbers, userLotteryNumbers);

		assertThat(result.size(), is(2));
		assertThat(result.contains(12), is(true));
		assertThat(result.contains(26), is(true));
	}

}
