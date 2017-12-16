package main;

import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker {

	public Set<Integer> promptUserForLotteryNumbers() throws IOException {

		Set<Integer> userLotteryNumbers = new HashSet<Integer>();
		Scanner userInput = new Scanner(System.in);
		boolean isFullLotterySet = false;

		do {

			try {

				System.out.print("Please input a lottery number from 1 to 49: ");
				int lotteryNumber = userInput.nextInt();

				if (isValidInputRange(lotteryNumber)) {
					userLotteryNumbers.add(lotteryNumber);
				}

				if (userLotteryNumbers.size() == 6) {
					isFullLotterySet = true;
					userInput.close();
				}

			}

			catch (InputMismatchException exception) {
				System.out.println("Incorrect input, please try again!");
				userInput.next();
			}

		} while (!isFullLotterySet);

		return userLotteryNumbers;
	}

	public boolean isValidInputRange(int lotteryNumber) {
		return lotteryNumber >= 1 && lotteryNumber <= 49;
	}

}
