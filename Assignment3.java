import java.util.Scanner;
/* 
 * ----------------------------------------------------
 * AUTHOR: Joseph Siwiecki
 * FILENAME: Assignment3.java
 * SPECIFICATION: Using classes and objects, using conditional statements, and writing loops. 
 * FOR: CS 1400 - ASSIGNMENT #3
 * TIME SPENT: 45 Minutes
 * ----------------------------------------------------
 */

/*
 * 1. if (90 > score)
	  {
	    if (80 > score)
		{
		  if (70 > score)
			{
			  if(60 > score)
			  {
			    grade = 'F';
			  }
					
			  else
				grade = 'D';
			}	
			else 
			  grade = 'C';
		 }
		else
		  grade = 'B';
	   }
		else 
		  grade = 'A';
 *    
 *  2. switch (String.valueOf(letter).toUpperCase())
		{
		  case "A":
		  case "B":
			System.out.println("You are doing good!");
		    break;
		  case "C":
		  case "D":
			System.out.println("You need to study more!");
			break;
		  default: 
			System.out.println("Maybe next time!");
		}
 */


// why the heck does one space in eclipse equal three spaces in gradescope????????
// my code in eclipse looks super clean but on gradescope it looks extremely spaced out.
// i dont even use the tab button anymore but it still looks bad...
// like this is my fourth time going back and trying to fix it but it always looks bad i
// honestly blame gradescope pls dont take off points prof it will not work with me!!!
public class Assignment3 
{
    public static void main(String[] args)
    {	
    	
    // creates scanner object
    Scanner in = new Scanner(System.in);
    	
    // creates string s1 & s2 and stores user input in their respective strings
    System.out.println("Please enter a string: ");
    String stringOne = in.nextLine();
    System.out.println("Please enter another string: ");
    String stringTwo = in.nextLine();
    	
    // prints out wall of text with different options to choose from
    System.out.println("Command Options"
	+ "\n----------------------"
	+ "\nOption A: Checks if the length of the two strings are the same."
	+ "\nOption B: Checks if two strings are the same or different."
	+ "\nOption C: Checks which string is lexically larger, or if they are the same."
	+ "\nOption D: Prints out the first character (index 0) of each string."
	+ "\nOption E: Prints out a new string consisting of the first string concatenated (appended) with the second string."
    + "\nOption F: Prints out two strings using upper case letters."
	+ "\nOption Q: Quit the program.");
		
    // initializes option
    String option;
    	
    // do while loop used to go through the loop at least once, and then repeats until user quits choosing options. 
    do 
    {
	  // stores user choice in option
	  System.out.println("Please, enter an option from the menu: ");
	  option = in.nextLine().toUpperCase();
			
        // switch statement used to allow user to choose each option
		switch (option)
		{
	      case "A":
		    if (stringOne.length() == stringTwo.length())
			  System.out.println("The lengths are the same.");
			else 
			  System.out.println("The lengths are not the same.");
			  break;
		    		
		  case "B":
			if (stringOne.equals(stringTwo))
			  System.out.println("The two strings are the same.");
			else 
			  System.out.println("The two strings are different.");
			break;
		    		
		  case "C": 
			 if (stringOne.compareToIgnoreCase(stringTwo) == 0)
			   System.out.println("The two strings are lexicographically the same.");
			 else if (stringOne.compareToIgnoreCase(stringTwo) > 0)
			   System.out.println("The first string is lexicographically larger.");
			 else
			   System.out.println("The second string is lexicographically larger.");				
			 break;
			    		
		   case "D":
			  System.out.println("The first character of the first string is " + "\"" + stringOne.charAt(0) + "\".");
			  System.out.println("The first character of the second string is " + "\"" + stringTwo.charAt(0) + "\".");
			  break;
			    		
		   case "E": 
			  System.out.println("The concatenation of two strings is " + "\"" + stringOne + stringTwo + "\".");
			  break;
		    	
		   case "F":
			  System.out.println("The first string using upper case letters is " + "\"" + stringOne.toUpperCase() + "\".");
		      System.out.println("The second string using upper case letters is " + "\"" + stringTwo.toUpperCase() + "\".");
			  break;
			    	
		   case "Q":
			  break;
		    			
		   default:
			  System.out.println("Invalid option.");
		}
	} 
	    while (!(option.equals("Q")));
	    
    // final goodbye after user chooses to quit choosing options :)
    System.out.println("Goodbye!");
    	
    // saves memory by closing scanner object in
    in.close();
    
    }    
}
