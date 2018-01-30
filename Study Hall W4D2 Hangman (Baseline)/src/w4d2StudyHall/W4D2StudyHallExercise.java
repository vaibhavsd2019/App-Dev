package w4d2StudyHall;

import java.util.Scanner;

public class W4D2StudyHallExercise {
	/* Replace this line with a proper header which includes your name */

	private static String usersName;
	private static String inputFromUser;

	public static void main(String args[]) {
		/* Initialize the Text Hangman game */
		Scanner keyboard = new Scanner(System.in);
		usersName= keyboard.nextLine();
		
		/* Welcome the user and request the user to enter a name */
		System.out.println("Welcome");
		System.out.println("Please enter your name followed by a return");
		/* Read in the user's name */

		while (true) {
			
			/* Display menu */
			System.out.println(usersName+",Please enter a command letter follwoed by a return");
			System.out.println("p-> Play the game");
			System.out.println("s-> View statistics");
			System.out.println("q-> Quit");
			
			/* Read the menu character */
			inputFromUser= keyboard.next();

			/* Play the game? */
			if(inputFromUser.equals("p")) {
				System.out.println("Play the game command recognized");
			}
			/* View the statistics? */
			else if(inputFromUser.equals("s")) {
				System.out.println("View the statistics command recognized");
			}

			/* Quit the game? */
			else if(inputFromUser.equals("q")) {
				System.out.println("Quit the game comman recognized");
				System.out.println("Thankyou for playing"+usersName);
			}

			/* Display error (if command is none of the above) */
			else {
				System.out.println("***Error***");
				System.out.println("Invalid menu item entered. it must be p, q or s");
				System.out.println("The input found was:"+inputFromUser);
			}
		}
	}
}

