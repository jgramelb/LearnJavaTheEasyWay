import java.util.Scanner;

/* 
This game generates a random number. It asks the user to guess a number between -100 and 100. It counts how many tries it took to pick a correct number.
 */

public class HiLoCount {
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			String playAgain = "";
			int numberOfTries = 0;
			
			do {
				int theNumber = (int)(Math.random()*100+1)-100;
				//Ask user to guess number & print it out
				int guess = 0;
				while (guess != theNumber) {
					System.out.println("Guess a number between -100 and 100:");
					guess = scan.nextInt();
					numberOfTries = numberOfTries + 1;
					System.out.println("You entered " + guess +".");
					if (guess < theNumber)
						System.out.println(guess + " is too low. Try again.");
					else if (guess > theNumber)
						System.out.println(guess + " is too high. Try again.");
					else
						System.out.println(guess + " is correct. You win! \nIt only took you " + numberOfTries +" tries! Good work!");
						

					} //End of while loop for guessing
					System.out.println("Would you like to play again (y/n)?");
					playAgain = scan.next();
				}while (playAgain.equalsIgnoreCase("y"));
					System.out.println("Thank you for playing! Goodbye.");
					scan.close();
			}
		}

