/*-------------------------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Geek.java
// SPECIFICATION: Geek class that answers questions that are asked by the user.
// FOR: CS 1400 - ASSIGNMENT #5
// TIME SPENT: 30 Minutes
//----------------------------------------------------------------------*/

public class Geek 
{
	// instance variables of geek's name and number of questions
	private String name;
	private int numQ;
	
	// constructor
	public Geek (String name)
	{
		this.name = name;
		numQ = 0;
	}
	
	// returns the geek's name
	public String getName()
	{
		return this.name;
	}
	
	// returns the number of questions
	public int getNumberOfQuestions()
	{
		return this.numQ;
	}
	
	// checks if a number is even
	public boolean isEven(int num)
	{
		this.numQ++;
		if (num % 2 == 0)
			return true;
		return false;
	}
	
	// concatenates string to itself * count
	public String multiConcat(String text, int count)
	{
		this.numQ++;
		if (count < 2)
			return text;
		
		String phrase = "";
		
		for (int i = 0; i < count; i++)
			phrase += text;
		
		return phrase;
	}
	
	// returns the sum of num1 + num2
	public int sumRange(int num1, int num2)
	{
		this.numQ++;
		if (num1 > num2 || num1 == num2)
			return 0;
		int sum = 0;
		for (int i = num1; i < num2 - 1; i++)
		{
			sum += i + 1;
		}
		return sum;
	}
	
	// checks if the values are sorted smallest to largest
	public boolean sorted(int num1, int num2, int num3)
	{
		this.numQ++;
		if (num1 < num2 && num2 < num3)
			return true;
		return false;
	}
	
	// returns # of times the letter a is found in text
	public int countA(String text)
	{
		this.numQ++;
		int count = 0;
		for (int i = 0; i < text.length(); i++)
		{
			if (String.valueOf(text.charAt(i)).equalsIgnoreCase("A"))
				count++;
		}
		return count; 
	}
	
	// returns # of digits in num
	public int countDigits(int num)
	{
		return String.valueOf(num).length();
	}
	
	// checks if num is prime
	public boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
