/*
* Name:    Asma Ahmed 
* Date:    6/24/20
* Purpose: Demonstrate ability to use one dimensional arrays, ability to sort and search, & use methods
* 		   1) Generate Array 2) store 100 random integers 3) print elements of array
* 		   4) sort array in ascending order 5) display sorted array
* 		   6) Ask user for a number to search >>> display found or not found
* 		   7) display numbers from 1-100 + how many times they appear in the array
* 		   8) display average
* 		   9) display highest number
* 		   10) display lowest number
* Notes:   Windows Machine
* 		   Function = Method
*/

import java.util.Arrays; //view arrays as lists
import java.util.Random; //generate random numbers
import java.util.Scanner; //take input

public class OneDimensionArray {

	//random number generator method (1)
	public static int randomNumberGenerator()
	{
		Random ranNum = new Random();
		return (ranNum.nextInt(100)+ 1); //(2)
	}//close function
	
	//main function
	public static void main(String[] args) {
		try (Scanner inputNum = new Scanner(System.in)) {
			int [] num = new int[111];
			int count = 0;
			//generate random integers
			while(count <= 110)
				{
					num[count++] = randomNumberGenerator();
				}//close while
			//display generated array (3)
			System.out.println("Randomly Generated Array:");
			for(int a = 0; a < 110; a++)
				{
					if(a != 0 && a % 9 == 0)
						System.out.println();
					else
						System.out.print(num[a] + " ");
				}//close for
			
			// sort in ascending order (4)
			Arrays.sort(num);
			System.out.print("\n\nArray in Ascending Order:"); //display in ascending order (5)
			for(int a = 0; a < num.length; a++)
				{
					if(a % 9 == 0)
						System.out.println();
					else
						System.out.print(num[a] + " ");
				}//close for
			
			// search for a number (6)
			System.out.print("\n\nEnter a number to search: ");
			int search = inputNum.nextInt();
			boolean found = false;
			int index = 0;
			for(int a = 0; a < num.length; a++)
				{
					if(num[a] == search)
					{
						found = true;
						index = a;
						break;
					}//close if
				}//close for
									
			if(found)
				System.out.println(search + " is in index " + index);
			else
				System.out.println("Number Not Found");
			
			//display number of times each number is found in array (7)
			int [] counter = new int[101];
			int b, temp = 0;
			System.out.println("\nFrequency of Numbers:");
			for(b = 1; b < num.length; b++)
				{
					temp = num[b];
					counter[temp]++;
				}//close for
			for(int a = 1; a < counter.length; a++)
				{
					System.out.println(a + ": " + counter[a]);
				}//close for

			// average of the numbers in the array (8)
			int sum = 0, avg = 0;
			for(int a = 0; a < num.length; a++)
				{
					sum += num[a];
				}//close for
			avg = (sum / 100); //calculate average
			System.out.println("\nAverage: " + avg);

			// highest number in the array (9)
			int high = num[0];
			for(int a = 0; a < num.length; a++)
				{
					if(num[a] > high)
					high = num[a];
				}//close for
			System.out.println("\nThe highest number is: " + high);

			// lowest number in the array (10)
			int low = num[0];
			for(int a = 0; a < num.length - 1; a++)
				{
					if(num[a] < low)
					low = num[a];
				}//close for
			System.out.println("\nThe lowest number is: " + low);
			
			//close user input
			inputNum.close();
		} 
	}//close main
}//close 1DArray 
