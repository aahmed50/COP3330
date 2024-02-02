/*
* Name:    Asma Ahmed 
* Date:    6/05/20
* Purpose: Program that asks user how many beers they expect to drink on average and average $$ spent on a single beer to determine
* 		   1. how many beers will be consumed over a year
* 		   2. how many calories from beer will be intaken over a year
* 		   3. how much weight will be gained in a year based on beer intake
* 		   4. how much will the user spend in a year on beer
* Notes:   All output should be displayed using 2 digits of precision 
* 		   Ignore leap year 
* 		   Windows Machine
*/

//class made in package 
package hw3BeerAssignment;
//decimal format class to configure all numbers to set format
import java.text.DecimalFormat;
//scanner class to take input from user to be used in the program
import java.util.Scanner;

public class BeerAssignment {
    //format all decimals to be displayed using 2 digits of precision 
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
	  //user input
		Scanner inputNum = new Scanner(System.in);

        System.out.println("On average, how many beers will you consume each day?");
        float dailyBeers = inputNum.nextFloat(); //scan for input: number of beers per day
        System.out.println("On average, how much will you pay for each can of beer?");
        float price = inputNum.nextFloat(); //scan for input: price per can

        inputNum.close();
        //end user input
        
      //output
        
        //formulas
        //calculation for amount of beers consumed in one year (1)
        double yearlyBeers = dailyBeers * 365.00; 
        
        //calculation for calories consumed in one year (2)
        //assume a beer is 150 calories
        double calories = yearlyBeers * 150.00; 
        
        //calculation for weight gained in relation to calories from beer (3)
        //15lbs per year >>> 365/15=24.33 beers for each pound >>> 24.33*150(calories/can)=3645 calories in 1lb 
        //1(beer)/3645(calories per pound) >>> 1 beer = 0.000274
        double poundsPerCal = 0.000274; 
        double pounds = poundsPerCal * calories;
        
        //calculation for amount of money spent on beer per year (4)
        double yearlyExpense = yearlyBeers * price; 

        //display
        //use +df.format to call decimal format for each calculation to be printed decimals to the hundredth place
        System.out.println("That is approximately " +df.format(yearlyBeers)+ " beers in one year.");
        System.out.println("In one year, you will consume approximately " +df.format(calories)+ " calories from beer alone.");
        System.out.println("Without diet or exercise to counter these calories, you can expect to gain " +df.format(pounds)+ " pounds from drinking that much beer this year.");
        System.out.println("You spend " +df.format(yearlyExpense)+ " dollars yearly on beer.");
        
    }
}