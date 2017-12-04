package test;

import main.LotteryNumberGenerator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Set;

public class LotteryNumberGeneratorTest {

	@Test
	public void shouldGenerateSingleNumberBetween1And49() {
		int result = LotteryNumberGenerator.generateSingleLotteryNumber();
		assertTrue(result >= 1 && result <= 49);
	}

	@Test
	public void shouldReturnASixNumberSetWithNoDuplicates() {
		LotteryNumberGenerator underTest = new LotteryNumberGenerator();
		Set<Integer> result = underTest.generateLotteryNumbers();
		assertThat(result.size(), is(6));
	}

}
