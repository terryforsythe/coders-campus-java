package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import main.LotteryNumberMatcher;

public class LotteryNumberMatcherTest {

	Set<Integer> result;

	@Before
	public void setup() {

		LotteryNumberMatcher underTest = new LotteryNumberMatcher();
		final int LOTTERY_SIZE = 6;

		Set<Integer> lotteryNumbers = new HashSet<Integer>(LOTTERY_SIZE);
		lotteryNumbers.add(6);
		lotteryNumbers.add(12);
		lotteryNumbers.add(18);
		lotteryNumbers.add(19);
		lotteryNumbers.add(26);
		lotteryNumbers.add(37);

		Set<Integer> userLotteryNumbers = new HashSet<Integer>(LOTTERY_SIZE);
		userLotteryNumbers.add(8);
		userLotteryNumbers.add(9);
		userLotteryNumbers.add(12);
		userLotteryNumbers.add(20);
		userLotteryNumbers.add(23);
		userLotteryNumbers.add(26);

		result = underTest.matchLotteryNumbers(lotteryNumbers, userLotteryNumbers);
	}

	@Test
	public void shouldReturnSetWithTwoMatchedNumbers() {
		assertThat(result.size(), is(2));
		assertThat(result.contains(12), is(true));
		assertThat(result.contains(26), is(true));
	}

}
