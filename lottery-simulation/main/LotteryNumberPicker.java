package main;

import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class LotteryNumberPicker {

	Set<Integer> userLotteryNumbers;

	public Set<Integer> promptUserForLotteryNumbers() throws IOException {

		userLotteryNumbers = new HashSet<Integer>();
		Scanner userInput = new Scanner(System.in);

		do {

			try {

				System.out.print("Please input a lottery number from 1 to 49: ");
				int lotteryNumber = userInput.nextInt();

				if (isValidInput(lotteryNumber)) {
					userLotteryNumbers.add(lotteryNumber);
				}

			}

			catch (InputMismatchException exception) {
				System.out.println("Incorrect input, please try again!");
				userInput.next();
			}

		} while (isIncompleteLotterySet());

		userInput.close();

		return userLotteryNumbers;
	}

	private boolean isIncompleteLotterySet() {
		return userLotteryNumbers.size() != 6;
	}

	private boolean isNotDuplicateNumber(int lotteryNumber) {
		return !userLotteryNumbers.contains(lotteryNumber);
	}

	private boolean isValidInput(int lotteryNumber) {
		return isValidInputRange(lotteryNumber) && isNotDuplicateNumber(lotteryNumber);
	}

	private boolean isValidInputRange(int lotteryNumber) {
		return lotteryNumber >= 1 && lotteryNumber <= 49;
	}

	public boolean test_isValidInputRange(int lotteryNumber) {
		return isValidInputRange(lotteryNumber);
	}

}
