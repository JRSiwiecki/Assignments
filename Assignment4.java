/*
// AUTHOR: Joseph Siwiecki
// FILENAME: Assignment4.java
// SPECIFICATION: Asks for user to input numbers and checks if prime. Once user enters -1 to quit,
// 				  the program will return the max, the min, the sum, the count, and average of all 
//			      inputted numbers.
// FOR: CS 1400 - ASSIGNMENT #4
// TIME SPENT: 30 Minutes
*/

// imports scanner class + no part 1 this time
import java.util.Scanner;
public class Assignment4 
{
	public static void main(String[] args)
	{
		// creates scanner object and asks for user input intially...
		// i tried to use a do while here but it didn't seem to pan out,
		// couldn't make it work
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer. Enter -1 to quit.");
		int input = in.nextInt();
		
		// max and min need to be the first user input to avoid problems with the Math.max & Math.min functions
		int max = input, min = input, sum = 0, count = 0;
		
		// uses sentinel value to determine whether to loop again or not
		while (input != -1)
		{
			// assumes number is prime initially until proven false
			boolean prime = true;
			
			// edge case for if someone enters 0 or 1
			if (input <= 1)
				prime = false;

			// checks if prime starting from 2 to n - 1,
			// if input % i == 0 then it divides evenly, 
			// meaning the number can NOT be prime
			else 
			{
				for (int i = 2; i < input; i++)
				{
					if (input % i == 0)
						prime = false;					
				}
			}
			
			
			// prints out one message if prime, another if not
			if (prime)
				System.out.println("The number " + input + " is a prime number.");
			else
				System.out.println("The number " + input + " is not a prime number.");
			
			// keeps track of various values until user quits entering numbers
			sum += input;
			max = Math.max(input, max);
			min = Math.min(input,  min);
			count++;
			
			// asks for user input again and ends if -1 is entered
			System.out.println("Enter a positive integer. Enter -1 to quit.");
			input = in.nextInt();
		}
		
		// calculates average
		double average = (double) sum / count;
		
		// prints out the various values that were tracked
		System.out.println("The maximum positive number is: " + max);
		System.out.println("The minimum positive number is: " + min);
		System.out.println("The sum is: " + sum);
		System.out.println("The counter of number(s) is: " + count);
		System.out.println("The average is: " + average);
		
		// saves memory :^)
		in.close();
	}
}
