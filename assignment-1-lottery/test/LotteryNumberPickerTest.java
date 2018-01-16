package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import main.LotteryNumberPicker;

public class LotteryNumberPickerTest {

	LotteryNumberPicker underTest;

	@Before
	public void setup() {
		underTest = new LotteryNumberPicker();
	}

	@Test
	public void shouldReturnSetOfSixNumbersChosenByUser() throws IOException {
		Set<Integer> result = underTest.promptUserForLotteryNumbers();
		assertThat(result.size(), is(6));
	}

	@Test
	public void shouldNotValidateNumberZeroForInputRange() {
		int lotteryNumber = 0;
		boolean result = underTest.test_isValidInputRange(lotteryNumber);
		assertThat(result, is(false));
	}

	@Test
	public void shouldNotValidateNumberFiftyForInputRange() {
		int lotteryNumber = 50;
		boolean result = underTest.test_isValidInputRange(lotteryNumber);
		assertThat(result, is(false));
	}

}
