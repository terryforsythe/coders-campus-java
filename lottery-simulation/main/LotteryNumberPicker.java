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
		boolean isEmptyLotterySet = true;

		do {

			try {

				System.out.print("Please input a lottery number from 1 to 49: ");
				int lotteryNumber = userInput.nextInt();

				if (isValidLotteryInput(lotteryNumber)) {
					userLotteryNumbers.add(lotteryNumber);
				}

				if (userLotteryNumbers.size() == 6) {
					isEmptyLotterySet = false;
					userInput.close();
				}

			}

			catch (InputMismatchException exception) {
				System.out.println("Incorrect input, please try again!");
				userInput.next();
			}

		} while (isEmptyLotterySet);

		return userLotteryNumbers;
	}

	private boolean isValidLotteryInput(int lotteryNumber) {
		return isValidInputRange(lotteryNumber) && !isDuplicateNumber(lotteryNumber);
	}

	public boolean isValidInputRange(int lotteryNumber) {
		return lotteryNumber >= 1 && lotteryNumber <= 49;
	}

	public boolean isDuplicateNumber(int lotteryNumber) {
		return userLotteryNumbers.contains(lotteryNumber);
	}

}
