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

		Set<Integer> userNumbers = new HashSet<>(LOTTERY_SIZE);
		userNumbers.add(8);
		userNumbers.add(9);
		userNumbers.add(12);
		userNumbers.add(20);
		userNumbers.add(23);
		userNumbers.add(26);

		Set<Integer> result = lottery.matchLotteryNumbers(lotteryNumbers, userNumbers);

		assertThat(result.size(), is(2));
		assertThat(result.contains(12), is(true));
		assertThat(result.contains(26), is(true));
	}

}
