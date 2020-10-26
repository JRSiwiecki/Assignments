/*-----------------------------------------------------------
// AUTHOR: Joseph Siwiecki
// FILENAME: Collection.java
// SPECIFICATION: Creates a Collection object that represents an array
// and the amount of actual values added with various methods to interact with
// said array.
// FOR: CS 1400 - ASSIGNMENT #6
// TIME SPENT: 1 Hour spread across the day... mostly trying to
// figure out how to write the remove method
//-----------------------------------------------------------*/

public class Collection 
{
	// initializes array and makes count variable
	private int[] numArray;
	private int count;
	
	// creates array object and sets count = 0 to start
	public Collection(int arraySize)
	{
		numArray = new int[arraySize];
		count = 0;
	}
	
	// linear search to see if searchingNum is present in the array
	private int search(int searchingNum)
	{
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] == searchingNum)
				return i;
		}
		
		return -1;
	}
	
	// adds a number to the smallest available index if the numberToAdd
	// exists in the array and if the array has not reached capacity
	public boolean add(int numberToAdd)
	{
		if (search(numberToAdd) == -1)
		{
			if (count < numArray.length)
			{
				numArray[count] = numberToAdd;
				count++;
				return true;
			}
			
			doubleArray();
			numArray[count] = numberToAdd;
			count++;
			return true;
			
		}
		
		return false;
	}
	
	// removes a value and shifts all elements past the removed value to the left
	public boolean remove(int numberToRemove)
	{
		int index = search(numberToRemove);
		
		if (index == -1)
			return false;
		
		// creates a copy of the numArray to remember the values before overwriting them.
		int[] copy = new int[numArray.length * 2];
		
		for (int i = 0; i < count; i++)
		{
			copy[i] = numArray[i];
		}
		
		// replaces values of numarray with the 
		// values of copy at 1 element to the right
		for (int i = index; i < count; i++)
		{
			numArray[i] = copy[i + 1];
		}
		
		// last value should be reset because everything should have been moved over.
		count--;
		return true;
	}
	
	// doubles the array size by copying the old values 
	// into a different array and creating a new object 
	// with the same values but 2 * capacity
	public void doubleArray()
	{
		int[] copy = new int[numArray.length * 2];
		
		for (int i = 0; i < count; i++)
		{
			copy[i] = numArray[i];
		}
		
		numArray = new int[numArray.length * 2];
		
		for (int i = 0; i < count; i++)
		{
			numArray[i] = copy[i];
		}
	}
	
	// returns the largest number in the array.
	public int findLargest()
	{
		int largest = numArray[0];
		
		for (int i = 1; i < numArray.length; i++)
		{
			if (numArray[i] > largest)
				largest = numArray[i];
		}
		
		return largest;
	}
	
	// computes average of all elements in the array 
	public double computeAvg()
	{
		double avg = 0;
		
		for (int i = 0; i < numArray.length; i++)
			avg += numArray[i];
		
		
		// if i didnt use count here i got wonky output
		// so count to remember the actual values that are in the array
		return avg /= count;
	}
	
	// counts the number of positive values in the array
	public int countPositives()
	{
		int numOfPositives = 0;
		
		for (int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] > 0)
				numOfPositives++;
		}
		
		return numOfPositives;
	}
	
	// prints out the array excluding "unwritten" values
	public String toString()
	{
		String array = "{";
		
		for (int i = 0; i < count; i++)
		{
			if (i == count - 1)
			{
				array += numArray[i];
				break;
			}
			
			array += numArray[i] + ", ";
		}
		array += "}";
		
		return array;
	}
}
