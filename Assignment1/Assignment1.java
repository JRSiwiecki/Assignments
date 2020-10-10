/*
// AUTHOR: Joseph Siwiecki
// FILENAME: Expressions.java
// SPECIFICATION: Answers A-J from Expressions.java and writes program that shows produces runs of javelin throws from user input.
// FOR: CS 1400 - ASSIGNMENT #1
// TIME SPENT: 30 Minutes
//*/

/*
	a) Does a (15) multiplied by c (5) where the product is added to b (16) to equal 91. 
	b) Does a (15) modulus c (5) which is 0 because there is no remainder, then adds d (17) and divides by d (17) to equal 1.
 	c) Parts A & B return a to the original value of 15. This line adds 1 to 15 and prints 16.
 	d) Returns  the remainder of dividing d by c, which in this case is 2.
 	e) Divides d by c and returns the whole number of 3. Actual value is 3.4 but java will truncate the value and remove the decimal.
 	f) Java first divides 15 by 17 which returns 0 as it is truncated, then adds across. (17 + 0 + 16) = 33.
 	g) First adds 17 + 15 which is 32, then adds 17 + 16 which is 33, then divides 32 / 33 which is truncated to 0.
 	h) Takes square root of a * a which is 15 * 15 which will just equal 15 again.
 	i) Raises a (15) to the power of 2, which is 255.0 .
 	j)  Determines if a (15) or b (16) is higher and returns the highest number, which in this case is b or 16.
 */

import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args)
	{
		// Creates scanner object "in".
		Scanner in = new Scanner(System.in);
		
		// Asks for competitor's name and stores it in "name".
		System.out.print("Enter the competitor's name: ");
		String name = in.nextLine();
		
		System.out.println("\nOlympic Javelin Throws");
		System.out.println("Enter the distances, in meters, for " + name + "\n");
		
		// Asks for values of throw1, 2, and 3 and stores them.
		System.out.print("Please enter the distance for throw 1: ");
		double throw1 = in.nextDouble();
		System.out.print("Please enter the distance for throw 2: ");
		double throw2 = in.nextDouble();
		System.out.print("Please enter the distance for throw 3: ");
		double throw3 = in.nextDouble();
		
		// Prints out conversion of each throw to each value. 
		System.out.println("Yards: " + throw1 * 1.093 + ", " + throw2 * 1.093 + ", " + throw3 * 1.093 + ".");
		System.out.println("Feet: " + throw1 * 3.281 + ", " + throw2 * 3.281 + ", " + throw3 * 3.281 + ".");
		System.out.println("Inches: " + throw1 * 39.37 + ", " + throw2 * 39.37 + ", " + throw3 * 39.37 + ".");
		System.out.println("Centimeters: " + throw1 * 100 + ", " + throw2 * 100 + ", " + throw3 * 100 + ".");
		
		// Closes scanner.
		in.close();
	}
}
