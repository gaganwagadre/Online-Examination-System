
import java.util.Scanner;

public class game {

	// Function that implements the
	// number guessing game--------
	public static void
	guessingNumberGame()
	{
		
		Scanner Sc = new Scanner(System.in);

		
		int number = 1 + (int)(100 * Math.random());

		
		int K = 5;

		int i, guess;

		System.out.println("A number is choosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

		
		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");
			guess = Sc.nextInt();

			
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println("The number is " + "greater than " + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}
		if (i == K) {
			System.out.println("You have exhausted" + " K trials.");

			System.out.println("The number was " + number);
		}
	}

	
	public static void
	main(String arg[])
	{
      //  Function Call
		guessingNumberGame();
	}
}
