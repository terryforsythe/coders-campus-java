package main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker {

	public Set<Integer> promptUserForLotteryNumbers() throws IOException {

		Scanner userInput = new Scanner(System.in);
		Set<Integer> userLotteryNumbers;

		try {

			userLotteryNumbers = new HashSet<Integer>();

			for (int index = 0; index < 6; index++) {

				System.out.print("Please input a lottery number: ");
				userLotteryNumbers.add(userInput.nextInt());
			}

			return userLotteryNumbers;
		}

		finally {

			userInput.close();
		}

	}
}
