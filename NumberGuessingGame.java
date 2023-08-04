// NUMBER GAME BY ADARSH TRiPATHI
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int RandomNumber = rand.nextInt(100) + 1;

		int MaxAttempts = 3;
		int score = 0;
		boolean Playagain = true;

		while (Playagain) {
			int attempts = 0;
			System.out.println("Welcome to the number guessing game by Adarsh Tripathi");
			while (attempts<MaxAttempts) {

				int PlayerGuess = sc.nextInt();
				attempts++;
				System.out.println("Enter your guess between 1-100");
				if (PlayerGuess == RandomNumber) {
					System.out.println("Hurrah! you guess correct");
					score++;
					break;
				} else if (PlayerGuess < RandomNumber) {
					System.out.println("Oops! Number is lesser,Try again");
				} else {
					System.out.println("Oops! Number is Higher,Try again");
				}

				if (attempts == MaxAttempts) {
					System.out.println("Sorry, you've used all your attempts. The correct number was: " + RandomNumber);
				}
			}
			System.out.println("Your current score: " + score);
			System.out.println("Do you want to play again? (y/n)");
			String PlayagainResponse = sc.next();
			Playagain = PlayagainResponse.equalsIgnoreCase("y");
		}

		System.out.println("Thanks for playing the Number Game!");
		sc.close();

	}
}