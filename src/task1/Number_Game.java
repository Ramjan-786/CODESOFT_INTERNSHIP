package task1;

import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {

		boolean gameStart = true;

		int totalRounds = 0;
		int totalAttempt = 0;

		boolean guessedCorrectly = false;// after user guess right then value should be change


// 4. Repeat steps 2 and 3 until the user guesses the correct number.
		while (gameStart) {

			System.out.println("!!!****** Game is start **********!!!");
			
// 1. Generate a random number within a specified range, such as 1 to 100.
			int generatedNumber = (int) (Math.random() * (100 - 1 + 1)) + 1;
			System.out.println("System generated number :: " + generatedNumber);

// 2. Prompt the user to enter their guess for the generated number.
			Scanner sc = new Scanner(System.in);
// 5. Limit the number of attempts the user has to guess the number.
            System.out.println("Enter the attempt number for guess number !!!");
			int attemptNo = sc.nextInt();
			totalAttempt = totalAttempt + attemptNo;

			int temp = 1;
			// check for user don't enter zero no. for attempt
			if (attemptNo != 0) {

				while (temp <= attemptNo) {

					System.out.println("Enter your guess number ");
					int userGuessNo = sc.nextInt();

// 3. Compare the user's guess with the generated number and provide feedback on whether the guess
					// is correct, too high, or too low.

					if (userGuessNo == generatedNumber) {
						System.out.println("Correct! You've guessed the number.");
						guessedCorrectly = true;
						break; // Exit the loop if guessed correctly
					} else if (userGuessNo > generatedNumber) {
						System.out.println("too high! Try again.");
					} else {
						System.out.println("too low! Try again.");
					}
					temp++;
					totalRounds++;
				} // second while loop end

				// when user insert attempt number instead of zero or incorrect guess number
				// then show generated Number
				if (!guessedCorrectly) {
					if (!(attemptNo == 0))
						System.out.println("Sorry, you ran out of attempts! The correct number was " + generatedNumber);
				}

//6. Add the option for multiple rounds, allowing the user to play again.
				while (true) {
					System.out.println("do you want to play again ? (yes/no): !!!");

					String playAgain = sc.next();

					if (playAgain.equalsIgnoreCase("no")) {
						gameStart = false;// user don't want to play again !!!

						System.out.println("-------- Game completed ---------------");
					} else if (!playAgain.equalsIgnoreCase("yes")) {
						// Handle invalid input
						System.out.println("Invalid input! Please enter 'yes' or 'no'.");
						continue;
					}
					break;// this break statement work for "no" and "yes"

				} // third while loop end

			} // end if
			else {
				System.out.println("Please insert right attempt number more than Zero !!!");
			} // end else

// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.                
			// show score when user don't want to play again
			if (!gameStart) {
				System.out.println("!!!****** YOUR SCORE *****!!!");
				System.out.println("Total Rounds :: " + totalRounds);
				System.out.println("Total attempts :: " + totalAttempt);
			}

		} // first while loop end

	}

}
