/*
* Name:    Asma Ahmed 
* Date:    5/28/20
* Purpose: Program that asks user for three numbers and generates the sum and average as output. 
* Notes:   First calculate sum, then use sum to calculate average. 
* 		   Average is calculated by taking the sum and dividing by the number of variables.
* 		   Use the “+” to concatenate strings together. 
* 		   Windows Machine
*/

//scanner class to take input from user to be used in the program
import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) 
	{
		Scanner inputNum = new Scanner(System.in);
			//ask user for input
	    	System.out.printf("Enter three numbers:");
	    	
	    	//declare variables to return
	    	int x = inputNum.nextInt(); //number 1
	    	int y = inputNum.nextInt(); //number 2
	        int z = inputNum.nextInt(); //number 3
	        
	        //print input as output and new line
	        System.out.println("The three numbers are: " +x+ ", " +y+ ", and " +z); 
	        
	        //calculate integer sum
	        int sum = x + y + z;
	        
	        //print sum as output and new line
	        System.out.println("The sum of the numbers is: " +sum); 
	        
	        //calculate average (use float for more exact number, integers promoted to float)
	        float avg = (float) (sum / 3); 
	       
	        //print average
	        System.out.printf("The average of the numbers is: %.2f %n", +avg);

	inputNum.close();
	}

}
