import java.util.Scanner;
/*
// AUTHOR: Joseph Siwiecki
// FILENAME: Assignment 2
// SPECIFICATION: Answers questions in part #1 and part #2 plays rock paper scissors with the user. 
// FOR: CS 1400 - ASSIGNMENT #2
// TIME SPENT: 30 Minutes
//*/

/* 
 * 					PART 1
 * #1. System.out.println(myString.length());
 * #2  System.out.println(myString.toUpperCase());
 * #3  System.out.println(myString.charAt(15) + String.valueOf(myString.charAt(7)).toUpperCase() + myString.charAt(17) + String.valueOf(myString.charAt(18)).toUpperCase() + myString.charAt(16) + String.valueOf(myString.charAt(20)).toUpperCase() + myString.charAt(21));  
 * #4  a. True
 * 	   b. False
 *     c. True
 *     d. True
 */

public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// declares 3 variables representing the 3 choices in rock, paper, scissors
		final String ROCK = "rock";
		final String PAPER = "paper";
		final String SCISSORS = "scissors";
		
		// takes user input and converts it to lowercase.
		System.out.println("Player 1: Choose rock, paper, or scissors: ");
		String answer1 = in.nextLine();
		answer1 = answer1.toLowerCase();
		System.out.println("Player 2: Choose rock, paper, or scissors: ");
		String answer2 = in.nextLine();
		answer2 = answer2.toLowerCase();
		
		// logic to determine who wins in the game of rock, paper, scissors
		if (answer1.equals(ROCK))
		{
			if (answer2.equals(PAPER))
				System.out.println("Player 2 wins.");
			else if (answer2.equals(SCISSORS))
				System.out.println("Player 1 wins.");
			else if (answer2.equals(ROCK))
				System.out.println("The game is a tie.");
			else 
				System.out.println("Wrong choice!");
		}
		
		else if (answer1.equals(PAPER))
		{
			if (answer2.equals(SCISSORS))
				System.out.println("Player 2 wins.");
			else if (answer2.equals(ROCK))
				System.out.println("Player 1 wins.");
			else if (answer2.equals(PAPER))
				System.out.println("The game is a tie.");
			else 
				System.out.println("Wrong choice!");
		}
		
		else if (answer1.equals(SCISSORS))
		{
			if (answer2.equals(ROCK))
				System.out.println("Player 2 wins.");
			else if (answer2.equals(PAPER))
				System.out.println("Player 1 wins.");
			else if (answer2.equals(SCISSORS))
				System.out.println("The game is a tie.");
			else 
				System.out.println("Wrong choice!");
		}
		
		else 
			System.out.println("Wrong choice!");
			
		// saves memory :^)
		in.close();
	}
}
