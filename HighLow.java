import java.util.Scanner;
import java.util.Random;
public class HighLow {
	public static void main (String[] args) {
		
		int numberOfTries = 0;
		int success = 0;
		int guess = 0;
		
		String replay = "";
		Scanner input = new Scanner(System.in);
		
		do {
		Random rand = new Random();
		int answer = rand.nextInt(100);
		
		
		//below to show number randomly generated
		//System.out.println(answer);
	
		while (guess != answer) {
			System.out.println("Pick any number between 0 and 100");
			guess = input.nextInt();
			numberOfTries++;
			
		if (answer > guess) 
			System.out.println("The number you guessed is lower.");
		
		
		else if (answer < guess) 
			System.out.println("The number you guessed is higher");
		
		else
		System.out.println("Good Job! It only took you " + numberOfTries
				+ " tries!");
		// ask for player to play again
		}
		System.out.println("Would you like to play one more time (y/n)? ");
		replay = input.next();
	} while (replay.equalsIgnoreCase("y")); 
		// thanks for game
		System.out.println("Thank you for playing!");
			}
		}
	